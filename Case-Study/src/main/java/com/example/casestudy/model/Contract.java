package com.example.casestudy.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contract_id;
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private LocalDate contract_start_date;
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private LocalDate contract_end_date;
    private Double contract_deposit;
    private Double contract_total_money;
    private Integer employee_id;
    private Integer customer_id;
    private Integer service_id;

    public Contract() {
    }

    public Contract(Integer contract_id, LocalDate contract_start_date, LocalDate contract_end_date, Double contract_deposit, Double contract_total_money, Integer employee_id, Integer customer_id, Integer service_id) {
        this.contract_id = contract_id;
        this.contract_start_date = contract_start_date;
        this.contract_end_date = contract_end_date;
        this.contract_deposit = contract_deposit;
        this.contract_total_money = contract_total_money;
        this.employee_id = employee_id;
        this.customer_id = customer_id;
        this.service_id = service_id;
    }

    public Integer getContract_id() {
        return contract_id;
    }

    public void setContract_id(Integer contract_id) {
        this.contract_id = contract_id;
    }

    public LocalDate getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(LocalDate contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public LocalDate getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(LocalDate contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    public Double getContract_deposit() {
        return contract_deposit;
    }

    public void setContract_deposit(Double contract_deposit) {
        this.contract_deposit = contract_deposit;
    }

    public Double getContract_total_money() {
        return contract_total_money;
    }

    public void setContract_total_money(Double contract_total_money) {
        this.contract_total_money = contract_total_money;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }
}
