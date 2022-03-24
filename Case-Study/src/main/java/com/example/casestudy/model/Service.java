package com.example.casestudy.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer service_id;
    private String service_name;
    private Integer service_area;
    private Double service_cost;
    private Integer service_max_people;
    private Integer rent_type_id;
    private Integer service_type_id;
    private String standard_room;
    private String description_other_convenience;
    private Double pool_area;
    private Integer number_of_floors;
}
