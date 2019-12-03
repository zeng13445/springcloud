package com.linn.consumerfeign.controller;

import com.linn.consumerfeign.pojo.User;
import com.linn.consumerfeign.service.SchedualUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 该demo演示 使用feign的方式去消费服务
 */
@RestController
@RequestMapping("consumerFeign")
public class UserController {
    @Autowired
    private SchedualUserService schedualUserService;

    @GetMapping("queryById")
    public User queryById(Long id) {
        User user = schedualUserService.queryById(id);

        return user;
    }

}
