package com.example.authservice.controller;

import com.example.authservice.Domain.UserDomain;
import com.example.authservice.constant.JwtConstant;
import com.example.authservice.entity.User;
import com.example.authservice.security.CookieUtil;
import com.example.authservice.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.authservice.service.UserService;


import javax.servlet.http.HttpServletResponse;
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

    @PostMapping("/login")
    public ResponseEntity<String> login(HttpServletResponse res, @RequestBody UserDomain userDomain) {
        System.out.println("in log in");
        if (userDomain != null && userDomain.getName() != null && userDomain.getPsw() != null) {
            User user = userService.checkLogIn(userDomain);
            if (user != null ) {

                String jwt = JwtUtil.generateToken(user.getId(), JwtConstant.JWT_VALID_DURATION, user.getId());
                CookieUtil.create(res, JwtConstant.JWT_COOKIE_NAME, jwt, false, -1, "localhost");
                return ResponseEntity.ok().build();
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Invalid username or password");
    }
    @GetMapping("/logout")
    public ResponseEntity<String> logout(HttpServletResponse res) {
        CookieUtil.clear(res, JwtConstant.JWT_COOKIE_NAME, "localhost");
        return ResponseEntity.ok().build();
    }
}
