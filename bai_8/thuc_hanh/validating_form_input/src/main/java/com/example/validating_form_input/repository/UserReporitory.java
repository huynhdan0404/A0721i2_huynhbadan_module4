package com.example.validating_form_input.repository;

import com.example.validating_form_input.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReporitory extends JpaRepository<User,Long> {
    Page<User> findAll(Pageable pageable);
}
