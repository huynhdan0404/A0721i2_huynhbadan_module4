package com.example.validating_form_input.service;

import com.example.validating_form_input.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface UserService {
    Page<User> findAll(Pageable pageable);
    void saveUser(User user);
    void deleteUser(Long id);
    User findUserById(Long id);
}
