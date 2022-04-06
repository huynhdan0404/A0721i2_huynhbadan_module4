package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.AttachService;
import com.example.case_studyy.repository.IAttachServiceRepository;
import com.example.case_studyy.service.IAttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceService implements IAttachServiceService {
    @Autowired
    private IAttachServiceRepository attachServiceRepository;

    @Override
    public List<AttachService> listAttachService() {
        return (List<AttachService>) attachServiceRepository.findAll();
    }
}
