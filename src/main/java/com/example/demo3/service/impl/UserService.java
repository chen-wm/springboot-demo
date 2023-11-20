package com.example.demo3.service.impl;

import com.example.demo3.mapper.UserMapper;
import com.example.demo3.pojo.User;
import com.example.demo3.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUser();
    }
}
