package com.linn.user.controller;

import com.linn.user.pojo.User;
import com.linn.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;


    @GetMapping("queryById")
    public User queryById(Long id) {
        return userService.queryById(id);
    }
}
