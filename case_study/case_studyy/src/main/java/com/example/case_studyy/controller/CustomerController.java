package com.example.case_studyy.controller;

import com.example.case_studyy.model.Customer;
import com.example.case_studyy.service.ICustomerService;
import com.example.case_studyy.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("/customers")
    public ModelAndView getListCustomer(@PageableDefault(size = 3) Pageable pageable){
        return new ModelAndView("/customer/list","customers",customerService.listCustomer(pageable));
    }

    @GetMapping("/customer-create")
    public ModelAndView showFormCreateCustomer( Model model){
        model.addAttribute("customerTypes",customerTypeService.listCustomerType());
        return new ModelAndView("/customer/create","customer",new Customer());
    }

    @PostMapping("/create-customer")
    public String createCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult,Model model){
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerTypes",customerTypeService.listCustomerType());
            return "/customer/create";
        }else {
            customerService.saveCustomer(customer);
            return "redirect:/customers";
        }
    }

    @PostMapping("/delete-customer/{id}")
    public String deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
        return "redirect:/customers";
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView editCustomer(@PathVariable Long id,Model model){
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customerTypes",customerTypeService.listCustomerType());
        if(customer != null) {
            return new ModelAndView("/customer/edit","customer",customer);

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult,
                                       Model model){
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerTypes",customerTypeService.listCustomerType());
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            return modelAndView;
        }else {
            customerService.saveCustomer(customer);
            model.addAttribute("customerTypes",customerTypeService.listCustomerType());
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer", customer);
            modelAndView.addObject("message", "song updated successfully");
            return modelAndView;
        }
    }

    @PostMapping("/search")
    public ModelAndView searchCustomer(@RequestParam(name = "search",required = false) String name, @PageableDefault(size = 3) Pageable pageable){
        return new ModelAndView("/customer/list","customers",customerService.searchCustomer(name,pageable));
    }
}
