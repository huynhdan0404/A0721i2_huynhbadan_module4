package com.example.case_studyy.repository;

import com.example.case_studyy.model.AttachService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAttachServiceRepository extends CrudRepository<AttachService,Long> {
}
