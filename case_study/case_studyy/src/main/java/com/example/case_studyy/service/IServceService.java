package com.example.case_studyy.service;

import com.example.case_studyy.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IServceService {
    Page<Service> listService(Pageable pageable);
    void saveService(Service service);
    void deleteService(Long id);
    Service findServiceById(Long id);
}
