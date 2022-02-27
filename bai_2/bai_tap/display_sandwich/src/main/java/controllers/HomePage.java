package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePage {
    @RequestMapping(value = "")
    public String getHome(){
        return "index";
    }

    @RequestMapping(value = "/sandwich",method = RequestMethod.POST)
    public String getSandwich(@RequestParam(value = "lettuce", required = false) String lettuce,
                              @RequestParam(value = "tomato", required = false) String tomato,
                              @RequestParam(value = "mustard",required = false) String mustard,
                              @RequestParam(value = "sprouts",required = false) String sprouts,
                              Model model){
        String result = "";
        if (lettuce != null){
           result += "lettuce";
        }
        if (tomato != null){
           result += ",tomato";
        }
        if (mustard != null){
            result += ",mustard";
        }
        if (sprouts != null){
            result += ",sprouts";
        }
        model.addAttribute("result",result);
        return "index";
    }
}
