package com.example.case_studyy.repository;

import com.example.case_studyy.model.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractDetailRepository extends JpaRepository<ContractDetail,Long> {
}
