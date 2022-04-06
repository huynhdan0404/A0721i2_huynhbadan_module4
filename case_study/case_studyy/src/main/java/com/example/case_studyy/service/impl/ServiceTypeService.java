package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.ServiceType;
import com.example.case_studyy.repository.IServiceTypeRepository;
import com.example.case_studyy.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService {
    @Autowired
    private IServiceTypeRepository serviceTypeRepository;


    @Override
    public List<ServiceType> listServiceType() {
        return serviceTypeRepository.findAll();
    }
}
