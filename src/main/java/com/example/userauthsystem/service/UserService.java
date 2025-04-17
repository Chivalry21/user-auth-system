package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.entity.User;

import java.util.List;

public interface UserService {
        User createUser(User user);
        User getUserById(Long id);
        User updateUser(Long id, User user);
        void deleteUser(Long id);
        List<User> getAllUsers();
    }




