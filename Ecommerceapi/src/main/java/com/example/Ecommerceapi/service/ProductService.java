package com.example.Ecommerceapi.service;

import com.example.Ecommerceapi.dao.ProductRepo;
import com.example.Ecommerceapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public void deleteProduct(Integer productId) {
        productRepo.deleteById(productId);
    }
}
