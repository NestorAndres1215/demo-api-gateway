package com.example.user_service.controller;

import java.util.List;

import com.example.user_service.model.User;
import com.example.user_service.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
@Tag(name = "Users", description = "Gestión de usuarios")
public class UserController {


    private  final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}