package com.example.casestudy.model;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import java.util.Date;
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    private Integer customer_type_int;
    private String customer_name;
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private LocalDate customer_birthday;
    private Boolean customer_gender;
    private String customer_id_card;
    private String customer_phone;
    private String customer_email;
    private String customer_address;

    public Customer() {
    }

    public Customer(Integer customer_id, Integer customer_type_int, String customer_name, LocalDate customer_birthday, Boolean customer_gender, String customer_id_card, String customer_phone, String customer_email, String customer_address) {
        this.customer_id = customer_id;
        this.customer_type_int = customer_type_int;
        this.customer_name = customer_name;
        this.customer_birthday = customer_birthday;
        this.customer_gender = customer_gender;
        this.customer_id_card = customer_id_card;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getCustomer_type_int() {
        return customer_type_int;
    }

    public void setCustomer_type_int(Integer customer_type_int) {
        this.customer_type_int = customer_type_int;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public LocalDate getCustomer_birthday() {
        return customer_birthday;
    }

    public void setCustomer_birthday(LocalDate customer_birthday) {
        this.customer_birthday = customer_birthday;
    }

    public Boolean getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(Boolean customer_gender) {
        this.customer_gender = customer_gender;
    }

    public String getCustomer_id_card() {
        return customer_id_card;
    }

    public void setCustomer_id_card(String customer_id_card) {
        this.customer_id_card = customer_id_card;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}
