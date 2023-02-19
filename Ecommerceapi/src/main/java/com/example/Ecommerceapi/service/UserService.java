package com.example.Ecommerceapi.service;

import com.example.Ecommerceapi.dao.UserRepo;
import com.example.Ecommerceapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserService {

    @Autowired
    private UserRepo userRepo;
    public void add(User user) {
       userRepo.save(user);
    }

    public List<User> getall() {
        return userRepo.findAll();
    }

    public User getbyid(Integer id) {
        return userRepo.findById(id).get();
    }


    public void delete(Integer id) {
        userRepo.deleteById(id);
    }
}








