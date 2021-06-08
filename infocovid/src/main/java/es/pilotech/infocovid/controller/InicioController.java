package es.pilotech.infocovid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {

    @RequestMapping("inicio")
    public String inicio(Model model, Integer type){
        model.addAttribute("tipo", type);
        return "inicio";
    }

    @RequestMapping("info")
    public String contactoAutoSanitarias(Model model, Integer type){
        model.addAttribute("tipo", type);
        return "info";
    }

}