package com.example.case_studyy.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthday;
    private String gender;

    @Pattern(regexp = "(^090([0-9]){7}$|^091([0-9]){7})", message = "vui long nhap dung so dien thoai")
    private String phone;

    private String mail;
    private String address;

    @Pattern(regexp = "[0-9]{9}",message = "vui long nhap dung CMND")
    private String idCard;

    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerType;

    @OneToMany(mappedBy = "id")
    private Set<Contract> contracts;

    public Customer() {
    }

    public Customer(Long id, String name, String birthday, String gender, String phone, String mail, String address, String idCard) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.idCard = idCard;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
