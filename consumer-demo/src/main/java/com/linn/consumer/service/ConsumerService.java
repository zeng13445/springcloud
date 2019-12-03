package com.linn.consumer.service;

import com.linn.consumer.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public User queryById(Long id) {
        //使用ribbon负载均衡时，请求不能再是ip地址了
        //String url = "http://localhost:9091/user/queryById?id=" + id;
        String url = "http://USER-SERVICE/user/queryById?id=" + id;
        return restTemplate.getForObject(url, User.class);
    }

    public User hiError(Long id) {
        User user = new User();
        user.setId(id);
        user.setNote("服务宕机");
        return user;
    }

}
