package com.example.case_studyy.service;

import com.example.case_studyy.model.ContractDetail;
import com.example.case_studyy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractDetailService {
    Page<ContractDetail> listContractDetail(Pageable pageable);
    void saveContractDetail(ContractDetail contractDetail);
    void deleteContractDetail(Long id);
    ContractDetail findContractDetailById(Long id);
}
