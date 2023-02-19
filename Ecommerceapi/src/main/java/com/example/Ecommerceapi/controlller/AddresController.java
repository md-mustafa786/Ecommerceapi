package com.example.Ecommerceapi.controlller;

import com.example.Ecommerceapi.model.Address;
import com.example.Ecommerceapi.service.AddresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AddresController {

    @Autowired
    private AddresService addresService;

    @PostMapping("/add-Address")
    public ResponseEntity<String> addAddress(@RequestBody Address address){
        addresService.addAddress(address);
        return new ResponseEntity<>("Address added successfully", HttpStatus.CREATED);
    }
}
