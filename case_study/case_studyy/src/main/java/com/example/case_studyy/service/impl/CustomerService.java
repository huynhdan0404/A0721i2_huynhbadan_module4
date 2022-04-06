package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.Customer;
import com.example.case_studyy.repository.ICustomerRepository;
import com.example.case_studyy.repository.ICustomerTypeRepository;
import com.example.case_studyy.service.ICustomerService;
import com.example.case_studyy.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Page<Customer> listCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> searchCustomer(String name, Pageable pageable) {
        return customerRepository.searchByName(name,pageable);
    }
}
