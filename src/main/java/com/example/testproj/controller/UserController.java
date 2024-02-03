package com.example.testproj.controller;

import com.example.testproj.model.User;
import com.example.testproj.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllPeople(){
        return ResponseEntity.status(200).body(userService.getAll());
    }

    @PostMapping
    public ResponseEntity<User> addPeople (@RequestBody User user){
       return ResponseEntity.status(201).body(userService.add(user));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<User> deletePeople (@PathVariable("id") Long id){
        return ResponseEntity.status(200).body(userService.deleteByID(id));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findByID(@PathVariable("id") Long id) {
        return ResponseEntity.status(200).body(userService.findByID(id));
    }
}
