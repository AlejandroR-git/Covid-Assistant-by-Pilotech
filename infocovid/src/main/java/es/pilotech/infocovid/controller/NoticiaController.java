package es.pilotech.infocovid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.pilotech.infocovid.dominio.Noticia;
import es.pilotech.infocovid.service.NoticiaService;

@Controller
public class NoticiaController {

    @Autowired
    NoticiaService noticiaService;

    @RequestMapping("/noticias")
    public String listaNoticias(Model model){

        List<Noticia> noticias = noticiaService.getAll();

        model.addAttribute("listaNoticias", noticias);

        return "noticias/index";
    }

    @RequestMapping("/noticias/add")
    public String addNoticia(Model model){
        return "noticias/add";
    }

    @RequestMapping("/noticias/edit/{id}")
    public String editNoticia(Model model){
        return "noticias/edit";
    }

    @RequestMapping("/noticias/delete/{id}")
    public String deleteNoticia(){
        return "redirect:/noticias";
    }
}