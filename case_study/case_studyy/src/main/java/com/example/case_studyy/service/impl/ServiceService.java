package com.example.case_studyy.service.impl;

import com.example.case_studyy.repository.IServiceRepository;
import com.example.case_studyy.service.IServceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ServiceService implements IServceService {

    @Autowired
    private IServiceRepository serviceRepository;

    @Override
    public Page<com.example.case_studyy.model.Service> listService(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public void saveService(com.example.case_studyy.model.Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public com.example.case_studyy.model.Service findServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }
}
