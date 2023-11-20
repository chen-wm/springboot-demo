package com.example.demo3.controller;

import com.example.demo3.pojo.User;
import com.example.demo3.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    public List<User> select() {
        System.out.println(userService.getAllUsers());
        return userService.getAllUsers();
    }

    ;

}
