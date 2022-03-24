package com.example.casestudy.model;

import com.example.casestudy.model.Employee_model.Employee;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class User {
    @Id
    private String userName;
    private String passWord;

    public User() {
    }




    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


}
