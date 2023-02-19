package com.example.Ecommerceapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
@Table(name = "address_tbl")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;
    @Column(name = "address_name")
    private String addressName;
    @Column(name = "landmark")
    private String landmark;
    @Column(name = "address_phone_number")
    private String addressPhoneNumber;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "state")
    private String state;
    @JoinColumn(name = "user_id")
    @OneToOne
    private Integer userId;
}
