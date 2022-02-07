package com.example.authservice.controller;

import com.example.authservice.Domain.UserDomain;
import com.example.authservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.authservice.service.UserService;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @GetMapping("/findAllUser")
    public ResponseEntity<List<UserDomain>> findAllUser(){
            List<UserDomain> res = userService.getAllUser();
            System.out.println("res"+res);
            return ResponseEntity.ok().body(res);
    }

    @GetMapping("/test")
    public Map<String, Integer> test(){
        Map<String, Integer> h = new HashMap<>();
        h.put("test",1);
        h.put("test1",2);
        return h;
    }
}
