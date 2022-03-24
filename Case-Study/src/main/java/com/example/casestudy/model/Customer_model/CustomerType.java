package com.example.casestudy.model.Customer_model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerType {
    @Id
    private Integer customer_type_id;
    private String customer_type_name;

    public CustomerType() {
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
