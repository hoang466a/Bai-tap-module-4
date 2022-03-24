package com.example.casestudy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer division_id;
    private String division_name;

    public Division() {
    }

    public Division(Integer division_id, String division_name) {
        this.division_id = division_id;
        this.division_name = division_name;
    }

    public Integer getDivision_id() {
        return division_id;
    }

    public void setDivision_id(Integer division_id) {
        this.division_id = division_id;
    }

    public String getDivision_name() {
        return division_name;
    }

    public void setDivision_name(String division_name) {
        this.division_name = division_name;
    }
}
