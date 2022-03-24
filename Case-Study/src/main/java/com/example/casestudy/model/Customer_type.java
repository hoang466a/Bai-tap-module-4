package com.example.casestudy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer_type {
    @Id
    private Integer customer_type_id;
    private String customer_type_name;

    public Customer_type() {
    }

    public Customer_type(Integer customer_type_id, String customer_type_name) {
        this.customer_type_id = customer_type_id;
        this.customer_type_name = customer_type_name;
    }

    public Integer getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(Integer customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public String getCustomer_type_name() {
        return customer_type_name;
    }

    public void setCustomer_type_name(String customer_type_name) {
        this.customer_type_name = customer_type_name;
    }
}
