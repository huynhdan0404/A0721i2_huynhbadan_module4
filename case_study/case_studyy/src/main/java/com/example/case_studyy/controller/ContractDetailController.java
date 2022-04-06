package com.example.case_studyy.controller;

import com.example.case_studyy.model.AttachService;
import com.example.case_studyy.model.Contract;
import com.example.case_studyy.model.ContractDetail;
import com.example.case_studyy.service.impl.AttachServiceService;
import com.example.case_studyy.service.impl.ContractDetailService;
import com.example.case_studyy.service.impl.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contractdetail")
public class ContractDetailController {
    @Autowired
    private ContractDetailService contractDetailService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private AttachServiceService attachServiceService;

    @GetMapping("/contractdetails")
    public ModelAndView getListcontractdetail(@PageableDefault(size = 3) Pageable pageable){
        return new ModelAndView("/contract_detail/list","contractdetails",contractDetailService.listContractDetail(pageable));
    }

    @GetMapping("/contractdetail-create")
    public ModelAndView showFormCreatecontractdetail(Model model){
        model.addAttribute("attachservices",attachServiceService.listAttachService());
        model.addAttribute("contracts",contractService.listContract(Pageable.unpaged()));
        return new ModelAndView("/contract_detail/create","contractdetail",new ContractDetail());
    }

    @PostMapping("/create-contractdetail")
    public String createCustomer(@ModelAttribute("contractdetail") ContractDetail contractDetail){
        contractDetailService.saveContractDetail(contractDetail);
        return "redirect:/contractdetail/contractdetails";
    }

    @GetMapping("/delete-contractdetail/{id}")
    public String deleteContractdetail(@PathVariable Long id){
        contractDetailService.deleteContractDetail(id);
        return "redirect:/contractdetail/contractdetails";
    }
}
