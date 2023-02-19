package com.example.Ecommerceapi.dao;

import com.example.Ecommerceapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
