package com.example.codeCommerce.controller;

import com.example.codeCommerce.entity.UserEntity;
import com.example.codeCommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/codeCommerce")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello CodeCommerce";
    }


    @GetMapping("/users")
    public List<UserEntity> getUsers(){
        return userService.getAllUsers();
    }
}