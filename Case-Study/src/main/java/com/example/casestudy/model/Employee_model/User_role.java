package com.example.casestudy.model.Employee_model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_role {
    @Id
    private Integer role_id;
    private String username;

    public User_role() {
    }

    public User_role(Integer role_id, String username) {
        this.role_id = role_id;
        this.username = username;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
