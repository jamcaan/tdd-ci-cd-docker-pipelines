package com.hoaxify.controllers;

import com.hoaxify.enity.User;
import com.hoaxify.service.UserService;
import com.hoaxify.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


   @Autowired
   private UserService userService;

    @PostMapping("/api/1.0/users")
    public GenericResponse createUser(@RequestBody User user){
         userService.save(user);
         return new GenericResponse("User saved");

    }
}
