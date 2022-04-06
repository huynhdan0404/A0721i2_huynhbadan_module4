package com.example.case_studyy.model;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantuty;

    @ManyToOne(targetEntity = AttachService.class)
    private AttachService attachService;

    @ManyToOne(targetEntity = Contract.class)
    private Contract contract;


    public ContractDetail() {
    }

    public ContractDetail(Long id, int quantuty, AttachService attachService, Contract contract) {
        this.id = id;
        this.quantuty = quantuty;
        this.attachService = attachService;
        this.contract = contract;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public ContractDetail(Long id, int quantuty, AttachService attachService) {
        this.id = id;
        this.quantuty = quantuty;
        this.attachService = attachService;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantuty() {
        return quantuty;
    }

    public void setQuantuty(int quantuty) {
        this.quantuty = quantuty;
    }
}
