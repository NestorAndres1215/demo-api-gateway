package com.example.user_service.controller;

import com.example.user_service.model.Role;
import com.example.user_service.service.RoleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/roles")
@Tag(name = "Roles", description = "Gestión de roles")
public class RoleController {


    private final  RoleService roleService;

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }
}