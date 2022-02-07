package com.example.authservice.controller;

import com.example.authservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.authservice.service.UserService;


import java.util.List;

@RestController
public class LoginController {
    @Autowired
    UserService userService;

//    @Autowired
//    public LoginController(UserService userService) {
//        this.userService = userService;
//    }

    @GetMapping("/findAllUser")
    public ResponseEntity<List<User>> findAllUser(){
       System.out.println(userService.getAllUser());

            List<User> res = userService.getAllUser();
            return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
