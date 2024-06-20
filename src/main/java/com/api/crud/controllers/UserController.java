 package com.api.crud.controllers;

import com.api.crud.models.UserModel;
import com.api.crud.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUsers() {
		return this.userService.getUsers();
    }

    @PostMapping
    public UserModel saveUserModel(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id) {
        return this.userService.getById(id);
    }

    

    @PutMapping(path = "/{id}")
     public UserModel updateUserById(@RequestBody UserModel request, @PathVariable("id") Long id) {
         // Your logic to update the user goes here
         return this.userService.updateById(request, id);
     }

  
   
    // You may want to add a delete mapping as well
    @DeleteMapping(path = "/{id}")
    public boolean deleteUserById(@PathVariable Long id) {
        return this.userService.deleteUser(id);
    }
    
}
