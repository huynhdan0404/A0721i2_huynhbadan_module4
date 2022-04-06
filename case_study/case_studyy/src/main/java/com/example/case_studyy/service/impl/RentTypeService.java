package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.RentType;
import com.example.case_studyy.repository.IRentTypeRepository;
import com.example.case_studyy.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    private IRentTypeRepository rentTypeRepository;


    @Override
    public List<RentType> listRentType() {
        return rentTypeRepository.findAll();
    }
}
