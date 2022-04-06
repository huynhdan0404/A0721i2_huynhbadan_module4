package com.example.case_studyy.repository;

import com.example.case_studyy.model.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceTypeRepository extends JpaRepository<ServiceType,Long> {
}
