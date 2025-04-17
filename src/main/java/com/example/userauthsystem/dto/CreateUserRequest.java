package com.example.userauthsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CreateUserRequest {
    // Getters and Setters
    @NotBlank
    private String username;

    @Email
    @NotBlank
    private String email;

    private String role;

    public void setUsername(String username) { this.username = username; }

    public void setEmail(String email) { this.email = email; }

    public void setRole(String role) { this.role = role; }
}