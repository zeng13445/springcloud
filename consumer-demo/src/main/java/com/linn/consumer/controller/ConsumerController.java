package com.linn.consumer.controller;

import com.linn.consumer.pojo.User;
import com.linn.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 该demo演示 使用RestTemplate+Ribbon的方式去消费服务
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("{id}")
    public User queryById(@PathVariable Long id) {
        User user = consumerService.queryById(id);
        return user;
    }
}

