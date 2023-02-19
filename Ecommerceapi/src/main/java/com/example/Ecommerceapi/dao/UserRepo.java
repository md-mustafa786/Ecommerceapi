package com.example.Ecommerceapi.dao;

import com.example.Ecommerceapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
