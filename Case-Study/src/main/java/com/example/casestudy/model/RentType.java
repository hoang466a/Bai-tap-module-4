package com.example.casestudy.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class RentType {
    @Id
    private Integer rent_type;
    private String rent_type_name;
    private Double rent_type_cost;

    public RentType() {
    }

    public RentType(Integer rent_type, String rent_type_name, Double rent_type_cost) {
        this.rent_type = rent_type;
        this.rent_type_name = rent_type_name;
        this.rent_type_cost = rent_type_cost;
    }

    public Integer getRent_type() {
        return rent_type;
    }

    public void setRent_type(Integer rent_type) {
        this.rent_type = rent_type;
    }

    public String getRent_type_name() {
        return rent_type_name;
    }

    public void setRent_type_name(String rent_type_name) {
        this.rent_type_name = rent_type_name;
    }

    public Double getRent_type_cost() {
        return rent_type_cost;
    }

    public void setRent_type_cost(Double rent_type_cost) {
        this.rent_type_cost = rent_type_cost;
    }
}
