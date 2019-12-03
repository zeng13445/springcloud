package com.linn.user.service;

import com.linn.user.mapper.UserMapper;
import com.linn.user.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Value("${server.port}")
    private Integer port;

    public User queryById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        user.setIpPort(port);
        return user;
    }
}

