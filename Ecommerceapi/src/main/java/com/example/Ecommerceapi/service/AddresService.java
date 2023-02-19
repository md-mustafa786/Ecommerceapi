package com.example.Ecommerceapi.service;

import com.example.Ecommerceapi.dao.AddresRepo;
import com.example.Ecommerceapi.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddresService {
    @Autowired
    private AddresRepo addresRepo;
    public void addAddress(Address address) {
         addresRepo.save(address);
    }
}
