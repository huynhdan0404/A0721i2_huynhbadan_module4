package com.example.case_studyy.service.impl;

import com.example.case_studyy.model.Employee;
import com.example.case_studyy.repository.IEmployeeRepository;
import com.example.case_studyy.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public Page<Employee> listEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Employee> searchEmployee(String name, Pageable pageable) {
        return employeeRepository.searchByName(name,pageable);
    }
}
