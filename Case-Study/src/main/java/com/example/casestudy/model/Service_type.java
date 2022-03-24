package com.example.casestudy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service_type {
    @Id
    private Integer service_type_id;
    private String service_type_name;
}
