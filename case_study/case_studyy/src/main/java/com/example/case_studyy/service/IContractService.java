package com.example.case_studyy.service;

import com.example.case_studyy.model.Contract;
import com.example.case_studyy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> listContract(Pageable pageable);
    void saveContract(Contract contract);
    void deleteContract(Long id);
    Contract findContractById(Long id);
}
