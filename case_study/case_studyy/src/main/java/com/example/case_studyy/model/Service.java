package com.example.case_studyy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int area;
    private Double serviceCost;
    private int maxPeople;
    private String standardRoom;
    private Double poolArea;
    private String descriptionConvenience;
    private int numberOfFloors;

    @ManyToOne(targetEntity = RentType.class)
    private RentType rentType;

    @ManyToOne(targetEntity = ServiceType.class)
    private ServiceType serviceType;

    @OneToMany(mappedBy = "id")
    private Set<Contract> contracts;

    public Service() {
    }

    public Service(Long id, String name, int area, Double serviceCost, int maxPeople, String standardRoom, Double poolArea, String descriptionConvenience, int numberOfFloors) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.serviceCost = serviceCost;
        this.maxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.descriptionConvenience = descriptionConvenience;
        this.numberOfFloors = numberOfFloors;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public String getDescriptionConvenience() {
        return descriptionConvenience;
    }

    public void setDescriptionConvenience(String descriptionConvenience) {
        this.descriptionConvenience = descriptionConvenience;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
