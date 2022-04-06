package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.Contract;
import com.example.case_studyy.repository.IContractRepository;
import com.example.case_studyy.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository contractRepository;

    @Override
    public Page<Contract> listContract(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void saveContract(Contract contract) {
        contractRepository.save(contract);

    }

    @Override
    public void deleteContract(Long id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Contract findContractById(Long id) {
        return null;
    }


}
