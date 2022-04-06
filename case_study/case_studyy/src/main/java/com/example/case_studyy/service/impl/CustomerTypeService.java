package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.CustomerType;
import com.example.case_studyy.repository.ICustomerTypeRepository;
import com.example.case_studyy.service.ICustomerTypeService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository customerTypeRepository;


    @Override
    public List<CustomerType> listCustomerType() {
        return (List<CustomerType>) customerTypeRepository.findAll();
    }
}
