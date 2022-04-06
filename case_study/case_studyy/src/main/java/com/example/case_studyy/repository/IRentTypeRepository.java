package com.example.case_studyy.repository;

import com.example.case_studyy.model.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentTypeRepository extends JpaRepository<RentType,Long> {
}
