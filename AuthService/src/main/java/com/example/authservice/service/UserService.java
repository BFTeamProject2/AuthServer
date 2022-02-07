package com.example.authservice.service;

import com.example.authservice.Domain.UserDomain;
import com.example.authservice.entity.User;

import java.util.List;

public interface UserService{
    List<UserDomain> getAllUser();
}
