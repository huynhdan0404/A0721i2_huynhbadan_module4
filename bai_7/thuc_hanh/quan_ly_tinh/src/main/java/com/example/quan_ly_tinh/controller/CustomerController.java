package com.example.quan_ly_tinh.controller;

import com.example.quan_ly_tinh.model.Customer;
import com.example.quan_ly_tinh.model.Province;
import com.example.quan_ly_tinh.service.CustomerService;
import com.example.quan_ly_tinh.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService ;

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("")
    public ModelAndView getCustomerList(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("list", "customers", customerService.findAll(pageable));
    }

    @GetMapping("/create")
    public ModelAndView getCreatePage(Model model){
        List<Province> provinces = provinceService.findAll();
        model.addAttribute("provinces", provinces);
        return new ModelAndView("create", "customer", new Customer());
    }

    @PostMapping("/create")
    public String saveCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("message", "Create success");
        return "redirect:/";
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView editCustomer(@PathVariable Long id){
        Customer customer = customerService.findCustomerById(id);
        return new ModelAndView("/edit","customer",customer);
    }

    @PostMapping("/edit-customer")
    public String editCustomer(@ModelAttribute Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/";
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView deleteCustomer(@PathVariable Long id){
        Customer customer = customerService.findCustomerById(id);
        return new ModelAndView("/delete","customer", customer);
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute Customer customer){
        customerService.deleteCustomer(customer.getId());
        return "redirect:/";
    }
}
