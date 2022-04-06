package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.ContractDetail;
import com.example.case_studyy.repository.IContractDetailRepository;
import com.example.case_studyy.repository.IContractRepository;
import com.example.case_studyy.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContractDetailRepository contractDetailRepository;
    @Override
    public Page<ContractDetail> listContractDetail(Pageable pageable) {
        return contractDetailRepository.findAll(pageable);
    }

    @Override
    public void saveContractDetail(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void deleteContractDetail(Long id) {
        contractDetailRepository.deleteById(id);
    }

    @Override
    public ContractDetail findContractDetailById(Long id) {
        return contractDetailRepository.findById(id).orElse(null);
    }
}
