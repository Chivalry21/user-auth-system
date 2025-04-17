package com.example.userauthsystem.service;

import com.example.userauthsystem.dto.CreateUserRequest;
import com.example.userauthsystem.dto.UpdateUserRequest;
import com.example.userauthsystem.dto.UserResponse;

import java.util.List;

public interface UserService {
        UserResponse createUser(CreateUserRequest request);
        UserResponse getUserById(Long id);
        UserResponse updateUser(Long id, UpdateUserRequest request);
        void deleteUser(Long id);
        List<UserResponse> getAllUsers();
}


