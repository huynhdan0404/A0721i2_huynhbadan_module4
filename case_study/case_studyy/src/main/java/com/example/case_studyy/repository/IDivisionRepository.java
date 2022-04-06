package com.example.case_studyy.repository;

import com.example.case_studyy.model.Divition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDivisionRepository extends JpaRepository<Divition,Long> {
}
