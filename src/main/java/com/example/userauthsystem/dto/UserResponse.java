package com.example.userauthsystem.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponse {
    // Getters and Setters
    private Long id;
    private String username;
    private String email;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void setId(Long id) { this.id = id; }

    public void setUsername(String username) { this.username = username; }

    public void setEmail(String email) { this.email = email; }

    public void setRole(String role) { this.role = role; }

    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}