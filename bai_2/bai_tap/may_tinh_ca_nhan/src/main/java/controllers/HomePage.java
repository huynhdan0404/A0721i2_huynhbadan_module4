package controllers;

import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/caculator",method = RequestMethod.POST)
    public String getCaculator(@RequestParam("number1") int number1,
                               @RequestParam("number2") int number2,
                               @RequestParam("submit") String submit,
                               Model model){
        int result = 0;
        if (submit.equals("addition")){
            result = number1 + number2;
        }else if (submit.equals("subtraction")){
            result = number1 - number2;
        }else if (submit.equals("multiplication")){
            result = number1 * number2;
        }else if (submit.equals("division")){
            result = number1/number2;
        }
        model.addAttribute("result",result);
        return "index";
    }
}
