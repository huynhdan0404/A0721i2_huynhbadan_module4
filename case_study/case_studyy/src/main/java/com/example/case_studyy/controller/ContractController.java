package com.example.case_studyy.controller;

import com.example.case_studyy.model.Contract;
import com.example.case_studyy.model.Customer;
import com.example.case_studyy.service.impl.ContractService;
import com.example.case_studyy.service.impl.CustomerService;
import com.example.case_studyy.service.impl.EmployeeService;
import com.example.case_studyy.service.impl.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ServiceService serviceService;

    @GetMapping("/contracts")
    public ModelAndView getListContract(@PageableDefault(size = 3) Pageable pageable){
        return new ModelAndView("/contract/list","contracts",contractService.listContract(pageable));
    }

    @GetMapping("/contract-create")
    public ModelAndView showFormCreateCustomer(Model model){
        model.addAttribute("employees",employeeService.listEmployee(Pageable.unpaged()));
        model.addAttribute("customers",customerService.listCustomer(Pageable.unpaged()));
        model.addAttribute("services",serviceService.listService(Pageable.unpaged()));
        return new ModelAndView("/contract/create","contract",new Contract());
    }

    @PostMapping("/create-contract")
    public String createCustomer(@ModelAttribute("contract") Contract contract){
        contractService.saveContract(contract);
        return "redirect:/contract/contracts";
    }

    @GetMapping("/delete-contract/{id}")
    public String deleteContract(@PathVariable Long id){
        contractService.deleteContract(id);
        return "redirect:/contract/contracts";
    }
}
