package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

@Controller
public class HomePage {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String getHome(){
        return "index";
    }

    @RequestMapping(value = "/tudien",method = RequestMethod.POST)
    public String getSearch(@RequestParam("english") String english,
                            Model model){
        String result = "";
        switch (english){
            case "hello":
                result = " xin chào";
                break;
            case "book":
                result = "sách";
                break;
            case "car":
                result = "xe hơi";
                break;
            case "dog":
                result = "con chó";
                break;
        }
        model.addAttribute("result",result);
        return "index";
    }
}
