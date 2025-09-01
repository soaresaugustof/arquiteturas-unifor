package com.unifor.arquiteturas.controller;

import com.unifor.arquiteturas.model.User;
import com.unifor.arquiteturas.service.UserInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadastrar-usuario")
public class UserController {

    private UserInterface userInterface;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userInterface.createUser(user));
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userInterface.getAllUsers());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@RequestParam Long id) {
        return ResponseEntity.ok(userInterface.getUserById(id));
    }
}
