package com.example.case_studyy.service;

import com.example.case_studyy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> listCustomer(Pageable pageable);
    void saveCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer findCustomerById(Long id);
    Page<Customer> searchCustomer(String name, Pageable pageable);

}
