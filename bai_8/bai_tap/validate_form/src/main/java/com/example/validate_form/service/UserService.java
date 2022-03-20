package com.example.validate_form.service;

import com.example.validate_form.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UserService {
    Page<User> findAll(Pageable pageable);
    void saveUser(User user);
    void deleteUser(Long id);
    User findUserById(Long id);
}
