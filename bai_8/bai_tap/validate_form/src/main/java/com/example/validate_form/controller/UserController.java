package com.example.validate_form.controller;

import com.example.validate_form.model.User;
import com.example.validate_form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ModelAndView getUserList(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("list", "users", userService.findAll(pageable));
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate() {
        return new ModelAndView("create", "user", new User());
    }

    @PostMapping("/create-user")
    public String checkValidation(@Validated @ModelAttribute User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }else {
            userService.saveUser(user);
            return "redirect:/users";
        }
    }
}
