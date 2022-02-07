package com.example.authservice.service.impl;

import com.example.authservice.Domain.UserDomain;
import com.example.authservice.dao.UserRepository;
import com.example.authservice.entity.User;
import com.example.authservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Component

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDomain> getAllUser() {
        List<User> users = userRepository.getAllUser();
        return users.stream().map(user -> {
            return UserDomain.builder().name(user.getName()).psw(user.getPsw()).build();
        }).collect(Collectors.toList());


    }


}
