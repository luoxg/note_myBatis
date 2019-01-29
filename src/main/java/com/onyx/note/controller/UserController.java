package com.onyx.note.controller;

import com.onyx.note.entity.ResultReturn;
import com.onyx.note.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by User on 2019/1/28.
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResultReturn selectUser() throws IOException {
//        List<User> user = userService.getUser();
//        return new ResultReturn(user);
        return new ResultReturn("暂未开放");
    }
}
