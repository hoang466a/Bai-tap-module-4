package com.example.casestudy.model.Employee_model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    private Integer divisionId;
    private String divisionName;

    public Division() {
    }

    @JsonBackReference
    @OneToMany(mappedBy = "division",cascade = CascadeType.ALL)
    private Set<Employee> employee;


    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
}
