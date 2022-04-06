package com.example.case_studyy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Divition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "id")
    private Set<Employee> employees;

    public Divition() {
    }

    public Divition(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
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
}
