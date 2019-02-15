package com.onyx.note.service;

import com.onyx.note.dao.UserMapper;
import com.onyx.note.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lxg on 2019/1/28.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUser() {
        return userMapper.getUser();
    }
}
