package com.example.user_service.service;

import com.example.user_service.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public User createUser(User user) {
        user.setId((long) (users.size() + 1));
        users.add(user);
        return user;
    }
}