package com.example.validate_form.repository;

import com.example.validate_form.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReporitory extends JpaRepository<User,Long> {
    Page<User> findAll(Pageable pageable);
}
