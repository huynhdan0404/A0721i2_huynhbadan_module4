package com.example.case_studyy.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthday;

    @Pattern(regexp = "[0-9]{9}",message = "vui long nhap dung CMND")
    private String idCard;

    private Double salary;

    @Pattern(regexp = "(^090([0-9]){7}$|^091([0-9]){7})", message = "vui long nhap dung so dien thoai")
    private String phone;

    private String email;
    private String address;

    @ManyToOne(targetEntity = Position.class)
    private Position position;

    @ManyToOne(targetEntity = EducationDegree.class)
    private EducationDegree educationDegree;

    @ManyToOne(targetEntity = Divition.class)
    private Divition divition;

    @ManyToOne(targetEntity = User.class)
    private User user;

    @OneToMany(mappedBy = "id")
    private Set<Contract> contracts;

    public Employee() {
    }

    public Employee(Long id, String name, String birthday, String idCard, Double salary, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Divition getDivition() {
        return divition;
    }

    public void setDivition(Divition divition) {
        this.divition = divition;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
