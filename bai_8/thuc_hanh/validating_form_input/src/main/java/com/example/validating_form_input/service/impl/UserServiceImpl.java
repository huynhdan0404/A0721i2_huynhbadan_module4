package com.example.validating_form_input.service.impl;

import com.example.validating_form_input.model.User;
import com.example.validating_form_input.repository.UserReporitory;
import com.example.validating_form_input.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserReporitory userReporitory;
    @Override
    public Page<User> findAll(Pageable pageable) {
        return userReporitory.findAll(pageable);
    }

    @Override
    public void saveUser(User user) {
        userReporitory.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userReporitory.deleteById(id);
    }

    @Override
    public User findUserById(Long id) {
        return userReporitory.findById(id).orElse(null);
    }
}
