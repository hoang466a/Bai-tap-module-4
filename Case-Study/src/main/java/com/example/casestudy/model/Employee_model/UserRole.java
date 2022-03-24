package com.example.casestudy.model.Employee_model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRole {
    @Id
    private Integer roleId;
    private String userName;

    public UserRole() {
    }



    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
