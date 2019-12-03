package com.linn.consumerfeign.service;

import com.linn.consumerfeign.pojo.User;
import com.linn.consumerfeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "user-service", fallback = SchedualServiceHiHystric.class)
public interface SchedualUserService {

    //这里的请求是服务的提供者的路径
    @GetMapping("/user/queryById")
    User queryById(@RequestParam(value = "id") Long id);
}
