package com.example.Ecommerceapi.controlller;

import com.example.Ecommerceapi.model.User;
import com.example.Ecommerceapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ecommerce-user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("adduser")
    public ResponseEntity<String> addUser(@RequestBody User user){
        userService.add(user);
        return new ResponseEntity<>("user details added successfully", HttpStatus.CREATED);
    }
    @GetMapping("/userid/{id}")
    public User getbyid(@PathVariable Integer id){
        return userService.getbyid(id);
    }


}
