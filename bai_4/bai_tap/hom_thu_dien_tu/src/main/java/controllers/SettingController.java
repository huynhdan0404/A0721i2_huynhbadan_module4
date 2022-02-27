package controllers;

import model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SettingController {
    @RequestMapping(value = "showForm", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("setting", new Setting());
        return "index";
    }

    @RequestMapping(value = "/settings", method = RequestMethod.POST)
    public String submit(@ModelAttribute("setting") Setting setting, ModelMap model) {
//        model.addAttribute("name", employee.getName());
//        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("setting", setting);
        return "display";
    }
}
