package com.example.case_studyy.repository;

import com.example.case_studyy.model.CustomerType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepository extends CrudRepository<CustomerType,Long> {
}
