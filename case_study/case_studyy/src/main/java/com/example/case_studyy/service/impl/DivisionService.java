package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.Divition;
import com.example.case_studyy.repository.IDivisionRepository;
import com.example.case_studyy.service.IDivitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivitionService {
    @Autowired
    private IDivisionRepository divisionRepository;
    @Override
    public List<Divition> listDivition() {
        return divisionRepository.findAll();
    }
}
