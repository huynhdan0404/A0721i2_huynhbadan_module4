package com.example.quan_ly_khach_hang.service;

import com.example.quan_ly_khach_hang.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();
    Optional<Customer> findById(Long id);
    void saveCustomer(Customer customer);
    void deleteCustomer(Long id);
}
