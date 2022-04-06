package com.example.case_studyy.controller;

import com.example.case_studyy.model.Customer;
import com.example.case_studyy.model.Employee;
import com.example.case_studyy.service.IDivitionService;
import com.example.case_studyy.service.IEducationDegreeService;
import com.example.case_studyy.service.IEmployeeService;
import com.example.case_studyy.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmloyeeController {
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IPositionService positionService;

    @Autowired
    private IEducationDegreeService educationDegreeService;

    @Autowired
    private IDivitionService divitionService;


    @GetMapping("/employees")
    public ModelAndView getListEmloyee(@PageableDefault(size = 3) Pageable pageable){
        return new ModelAndView("/employee/list","employees",employeeService.listEmployee(pageable));
    }

    @GetMapping("/emloyee-create")
    public ModelAndView showFormCreateEmloyee(Model model){
        model.addAttribute("positions",positionService.listPosition());
        model.addAttribute("educationDgrees",educationDegreeService.listEducationDegree());
        model.addAttribute("divitions",divitionService.listDivition());
        return new ModelAndView("/employee/create","employee",new Employee());
    }

    @PostMapping("/employee-create")
    public String createEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult,
                                 Model model){
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("positions",positionService.listPosition());
            model.addAttribute("educationDgrees",educationDegreeService.listEducationDegree());
            model.addAttribute("divitions",divitionService.listDivition());
            return "/employee/create";
        }else {
            employeeService.saveEmployee(employee);
            return "redirect:/employee/employees";
        }
    }

    @GetMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return "redirect:/employee/employees";
    }

    @GetMapping("/edit-employee/{id}")
    public ModelAndView editEmployee(@PathVariable Long id,Model model){
        Employee employee = employeeService.findEmployeeById(id);
        model.addAttribute("positions",positionService.listPosition());
        model.addAttribute("educationDgrees",educationDegreeService.listEducationDegree());
        model.addAttribute("divitions",divitionService.listDivition());
        if(employee != null) {
            return new ModelAndView("/employee/edit","employee",employee);

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-employee")
    public ModelAndView updateEmployee(@Valid @ModelAttribute("employee") Employee employee,BindingResult bindingResult,
                                       Model model){
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("positions",positionService.listPosition());
            model.addAttribute("educationDgrees",educationDegreeService.listEducationDegree());
            model.addAttribute("divitions",divitionService.listDivition());
            ModelAndView modelAndView = new ModelAndView("/employee/edit");
            return modelAndView;
        }else {
            employeeService.saveEmployee(employee);
            model.addAttribute("positions",positionService.listPosition());
            model.addAttribute("educationDgrees",educationDegreeService.listEducationDegree());
            model.addAttribute("divitions",divitionService.listDivition());
            ModelAndView modelAndView = new ModelAndView("/employee/edit");
            modelAndView.addObject("employee", employee);
            modelAndView.addObject("message", "cap nhat thanh cong");
            return modelAndView;
        }
    }

    @PostMapping("/search")
    public ModelAndView searchEmployee(@RequestParam(name = "search",required = false) String name, @PageableDefault(size = 3) Pageable pageable){
        return new ModelAndView("/employee/list","employees",employeeService.searchEmployee(name,pageable));
    }
}
