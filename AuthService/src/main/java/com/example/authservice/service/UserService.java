package com.example.authservice.service;

import com.example.authservice.dao.UserRepository;
import com.example.authservice.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component

public interface UserService{
    List<User> getAllUser();
}
