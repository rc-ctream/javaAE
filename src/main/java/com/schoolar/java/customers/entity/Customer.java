package com.schoolar.java.customers.entity;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    private String name;

    @Column( name = "email" )
    private String post;

    public Customer() {
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost( String post ) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Customer{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", post='" + post + '\'' +
               '}';
    }
}
