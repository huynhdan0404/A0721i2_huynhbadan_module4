package com.example.case_studyy.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startDate;
    private String endDate;
    private Double concactDeposit;
    private Double totalMoney;

    @OneToMany(mappedBy = "id")
    private Set<ContractDetail> contractDetails;

    @ManyToOne(targetEntity = Service.class)
    private Service service;

    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;

    @ManyToOne(targetEntity = Employee.class)
    private Employee employee;

    public Contract() {
    }

    public Contract(Long id, String startDate, String endDate, Double concactDeposit, Double totalMoney, Set<ContractDetail> contractDetails) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.concactDeposit = concactDeposit;
        this.totalMoney = totalMoney;
        this.contractDetails = contractDetails;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getConcactDeposit() {
        return concactDeposit;
    }

    public void setConcactDeposit(Double concactDeposit) {
        this.concactDeposit = concactDeposit;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
