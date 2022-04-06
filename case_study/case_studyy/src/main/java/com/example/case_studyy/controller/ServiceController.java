package com.example.case_studyy.controller;

import com.example.case_studyy.model.Customer;
import com.example.case_studyy.model.Service;
import com.example.case_studyy.service.IRentTypeService;
import com.example.case_studyy.service.IServceService;
import com.example.case_studyy.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/servicess")
public class ServiceController {
    @Autowired
    private IServceService servceService;

    @Autowired
    private IServiceTypeService serviceTypeService;

    @Autowired
    private IRentTypeService rentTypeService;

    @GetMapping("/services")
    public ModelAndView getListService(@PageableDefault(size = 3) Pageable pageable){
        return new ModelAndView("/service/list","services",servceService.listService(pageable));
    }

    @GetMapping("/service-create")
    public ModelAndView showFormCreateService(Model model){
        model.addAttribute("serviceTypes",serviceTypeService.listServiceType());
        model.addAttribute("rentTypes",rentTypeService.listRentType());
        return new ModelAndView("/service/create","service",new Service());
    }

    @PostMapping("/create-customer")
    public String createCustomer(@ModelAttribute("service") Service service){
        servceService.saveService(service);
        return "redirect:/servicess/services";
    }
}
