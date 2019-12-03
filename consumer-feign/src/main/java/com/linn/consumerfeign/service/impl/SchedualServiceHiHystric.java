package com.linn.consumerfeign.service.impl;

import com.linn.consumerfeign.pojo.User;
import com.linn.consumerfeign.service.SchedualUserService;
import org.springframework.stereotype.Service;

@Service
public class SchedualServiceHiHystric implements SchedualUserService {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setId(id);
        user.setNote("服务器宕机");
        return user;
    }
}
