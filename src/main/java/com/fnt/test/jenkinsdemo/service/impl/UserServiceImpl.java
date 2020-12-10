package com.fnt.test.jenkinsdemo.service.impl;

import com.fnt.test.jenkinsdemo.entity.User;
import com.fnt.test.jenkinsdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> list() {
        return null;
    }
}
