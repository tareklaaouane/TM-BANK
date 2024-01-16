package com.example.tmbank.dtos.user;

public record CreateUserRequest(String username, String password, String email) {
}