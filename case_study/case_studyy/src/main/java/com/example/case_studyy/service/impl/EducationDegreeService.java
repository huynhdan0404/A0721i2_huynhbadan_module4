package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.EducationDegree;
import com.example.case_studyy.repository.IEducationDegreeRepository;
import com.example.case_studyy.service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> listEducationDegree() {
        return educationDegreeRepository.findAll();
    }
}
