package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String getHome(){
        return "index";
    }

    @RequestMapping(value = "/swap",method = RequestMethod.POST)
    public String getSwap(@RequestParam("usd") int usd,
                            Model model){
        int vnd = usd*23000;
        model.addAttribute("vnd",vnd);
        return "index";
    }
}
