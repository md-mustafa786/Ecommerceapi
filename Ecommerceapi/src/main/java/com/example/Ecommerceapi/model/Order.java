package com.example.Ecommerceapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_tbl")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private Integer userId;
    @JoinColumn(name = "product_id")
    @ManyToOne
    private Integer productId;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Integer addressId;
    @Column(name = "product_quantity")
    private Integer productQuantity;
}


