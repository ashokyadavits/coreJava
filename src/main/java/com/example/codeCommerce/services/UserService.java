package com.example.codeCommerce.services;

import com.example.codeCommerce.entity.UserEntity;
import com.example.codeCommerce.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Get all users
    public List<UserEntity> getAllUsers() {
        //return userRepository.findAll();

        return userRepository.findAll().stream().limit(10).toList();
    }
}