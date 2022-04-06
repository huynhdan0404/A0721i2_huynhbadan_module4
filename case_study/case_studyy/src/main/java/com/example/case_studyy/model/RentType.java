package com.example.case_studyy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double rentCost;

    @OneToMany(mappedBy = "id")
    private Set<Service> services;

    public RentType() {
    }

    public RentType(Long id, String name, Double rentCost) {
        this.id = id;
        this.name = name;
        this.rentCost = rentCost;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRentCost() {
        return rentCost;
    }

    public void setRentCost(Double rentCost) {
        this.rentCost = rentCost;
    }
}
