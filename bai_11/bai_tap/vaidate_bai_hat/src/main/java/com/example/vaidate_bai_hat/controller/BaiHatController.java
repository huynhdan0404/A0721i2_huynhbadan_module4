package com.example.vaidate_bai_hat.controller;

import com.example.vaidate_bai_hat.model.BaiHat;
import com.example.vaidate_bai_hat.service.IBaiHatService;
import com.example.vaidate_bai_hat.service.impl.BaiHatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaiHatController {
    @Autowired
    IBaiHatService baiHatService;

    @GetMapping("/baihats")
    public ModelAndView getListBaiHat(){
        return new ModelAndView("list","baihats",baiHatService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate(){
        return new ModelAndView("create","baihat",new BaiHat());
    }

    @PostMapping("/create")
    public String checkValidation(@Validated @ModelAttribute("baihat") BaiHat baiHat, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }else {
            baiHatService.save(baiHat);
            return "redirect:/baihats";
        }
    }

}
