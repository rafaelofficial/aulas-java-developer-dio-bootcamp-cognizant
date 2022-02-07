package com.cognizant.dio.springbootjwt.controller;

import com.cognizant.dio.springbootjwt.data.UserData;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthController(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    // encripta a senha e faz a validação
    @PostMapping("/login")
    public void login(@RequestBody UserData userData) {
        userData.setPassword(bCryptPasswordEncoder.encode(userData.getPassword()));
    }
}
