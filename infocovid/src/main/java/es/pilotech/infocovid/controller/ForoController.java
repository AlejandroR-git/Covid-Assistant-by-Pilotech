package es.pilotech.infocovid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.pilotech.infocovid.dominio.Publicacion;
import es.pilotech.infocovid.service.ForoService;

@Controller
public class ForoController {

    @Autowired
    ForoService foroService;

    @RequestMapping("/foro")
    public String listaForo(Model model){

        List<Publicacion> publicaciones = foroService.getAll();

        model.addAttribute("listaPosts", publicaciones);

        return "foro/index";
    }

    @RequestMapping("/foro/add")
    public String addPost(){
        return "foro/add";
    }

    @RequestMapping("/foro/edit/{id}")
    public String editPost(){
        return "foro/edit";
    }

    @RequestMapping("/foro/verif/{id}")
    public String verifPost(){
        return "foro/verif";
    }

    @RequestMapping("/foro/delete/{id}")
    public String deletePost(){
        return "redirect:/foro";
    }
}