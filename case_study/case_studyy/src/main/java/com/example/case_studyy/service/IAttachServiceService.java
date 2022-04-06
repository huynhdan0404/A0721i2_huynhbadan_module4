package com.example.case_studyy.service;

import com.example.case_studyy.model.AttachService;
import com.example.case_studyy.model.Contract;
import com.example.case_studyy.model.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IAttachServiceService {
    List<AttachService> listAttachService();
}
