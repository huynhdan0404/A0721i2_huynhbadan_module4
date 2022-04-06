package com.example.case_studyy.service;

import com.example.case_studyy.model.Customer;
import com.example.case_studyy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {
    Page<Employee> listEmployee(Pageable pageable);
    void saveEmployee(Employee employee);
    void deleteEmployee(Long id);
    Employee findEmployeeById(Long id);
    Page<Employee> searchEmployee(String name, Pageable pageable);

}
