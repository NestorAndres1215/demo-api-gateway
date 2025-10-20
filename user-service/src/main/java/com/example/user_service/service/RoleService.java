package com.example.user_service.service;

import com.example.user_service.model.Role;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {

    private final List<Role> roles = new ArrayList<>();

    public List<Role> getAllRoles() {
        return roles;
    }

    public Role createRole(Role role) {
        role.setId((long) (roles.size() + 1));
        roles.add(role);
        return role;
    }
}