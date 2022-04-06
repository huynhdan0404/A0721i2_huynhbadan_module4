package com.example.case_studyy.repository;

import com.example.case_studyy.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<Service,Long> {
}
