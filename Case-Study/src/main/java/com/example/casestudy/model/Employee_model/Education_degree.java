package com.example.casestudy.model.Employee_model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education_degree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer education_degree_id;
    private String education_degree_name;

    public Education_degree() {
    }

    public Education_degree(Integer education_degree_id, String education_degree_name) {
        this.education_degree_id = education_degree_id;
        this.education_degree_name = education_degree_name;
    }

    public Integer getEducation_degree_id() {
        return education_degree_id;
    }

    public void setEducation_degree_id(Integer education_degree_id) {
        this.education_degree_id = education_degree_id;
    }

    public String getEducation_degree_name() {
        return education_degree_name;
    }

    public void setEducation_degree_name(String education_degree_name) {
        this.education_degree_name = education_degree_name;
    }
}
