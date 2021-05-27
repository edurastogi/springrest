package com.learning.springweb.controller;

import com.learning.springweb.model.User;
import com.learning.springweb.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController{

    private final UserDaoService service;

    public UserController(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/Users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

   @GetMapping("/Users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
   }

   @PostMapping("/Users")
   public void createUser(@RequestBody User user){
        User savedUser = service.save(user);
   }

}
