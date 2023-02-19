package com.example.Ecommerceapi.service;

import com.example.Ecommerceapi.dao.OrderRepo;
import com.example.Ecommerceapi.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;
    public Order getorder(Integer orderId) {
        return orderRepo.findById(orderId).get();

    }
}
