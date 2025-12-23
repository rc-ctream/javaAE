package com.schoolar.java.customers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "orders" )
@Setter
@Getter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    private String productName;
    private Double price;
}
