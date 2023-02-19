package com.example.Ecommerceapi.dao;

import com.example.Ecommerceapi.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddresRepo extends JpaRepository<Address,Integer> {

}
