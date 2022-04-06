package com.example.case_studyy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double attachServiceCost;
    private int attachServiceUnit;

    @OneToMany(mappedBy = "id")
    private Set<ContractDetail> contractDetails;

    public AttachService() {
    }

    public AttachService(Long id, String name, Double attachServiceCost, int attachServiceUnit) {
        this.id = id;
        this.name = name;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceUnit = attachServiceUnit;
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

    public Double getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(Double attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public int getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(int attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }
}
