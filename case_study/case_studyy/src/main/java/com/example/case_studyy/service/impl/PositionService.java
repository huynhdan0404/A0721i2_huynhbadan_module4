package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.Position;
import com.example.case_studyy.repository.IPositionRepository;
import com.example.case_studyy.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> listPosition() {
        return positionRepository.findAll();
    }
}
