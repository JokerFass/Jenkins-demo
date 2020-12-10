package com.fnt.test.jenkinsdemo.controller;

import com.fnt.test.jenkinsdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("list")
    public List<User> list() {
        User user = new User();
        return null;
    }
}
