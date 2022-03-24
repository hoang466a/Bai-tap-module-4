package com.example.casestudy.model.Employee_model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    private String employee_name;
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private LocalDate employee_birthday;
    private String employee_id_card;
    private Double employee_salary;
    private String employee_phone;
    private String employee_email;
    private String employee_address;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="position_id",referencedColumnName = "position_id")
    private Position position;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="education_degree_id",referencedColumnName = "education_degree_id")
    private Education_degree education_degree;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="division_id",referencedColumnName = "division_id")
    private Division division;

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name="username",referencedColumnName = "username")
    private User user;

    public Employee() {
    }

    public Employee(Integer employee_id, String employee_name, LocalDate employee_birthday, String employee_id_card, Double employee_salary, String employee_phone, String employee_email, String employee_address, Position position, Education_degree education_degree, Division division, User user) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_birthday = employee_birthday;
        this.employee_id_card = employee_id_card;
        this.employee_salary = employee_salary;
        this.employee_phone = employee_phone;
        this.employee_email = employee_email;
        this.employee_address = employee_address;
        this.position = position;
        this.education_degree = education_degree;
        this.division = division;
        this.user = user;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public LocalDate getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(LocalDate employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_id_card() {
        return employee_id_card;
    }

    public void setEmployee_id_card(String employee_id_card) {
        this.employee_id_card = employee_id_card;
    }

    public Double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Education_degree getEducation_degree() {
        return education_degree;
    }

    public void setEducation_degree(Education_degree education_degree) {
        this.education_degree = education_degree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
