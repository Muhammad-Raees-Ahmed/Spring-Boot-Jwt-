package com.example.spring_security_jwt.controllers;

import com.example.spring_security_jwt.models.User;
import com.example.spring_security_jwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser() {
        System.out.println("Getting Users");
        return userService.getUsers();
    }
    @GetMapping("/get-user-name")
    public String getUsername(Principal principal){
        return principal.getName();
    }
}
