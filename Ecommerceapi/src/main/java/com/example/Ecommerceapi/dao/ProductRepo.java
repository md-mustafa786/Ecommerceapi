package com.example.Ecommerceapi.dao;

import com.example.Ecommerceapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
