package com.example.casestudy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceType {
    @Id
    private Integer service_type_id;
    private String service_type_name;
}
