package com.schoolar.java.customers.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    private String name;

    @Embedded
    private Contact contact;

    @JoinTable( name = "customer_orders",
            joinColumns = @JoinColumn( name = "customer_id" ),
            inverseJoinColumns = @JoinColumn( name = "order_id" ) )
    @OneToMany( cascade = CascadeType.ALL, orphanRemoval = true )
    private List<Order> orders = new ArrayList<>();

    @Enumerated( EnumType.STRING )
    private CustomerStatus status = CustomerStatus.ACTIVE;

    public void addOrder( Order order ) {
        this.orders.add( order );
    }
}
