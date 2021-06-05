package es.pilotech.infocovid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.pilotech.infocovid.dominio.Noticia;
import es.pilotech.infocovid.service.NoticiaService;

@Controller
public class NoticiaController {

    @Autowired
    NoticiaService noticiaService;

    @RequestMapping("/noticias")
    public String listaNoticias(Model model, Integer type){

        List<Noticia> noticias = noticiaService.getAll();

        model.addAttribute("listaNoticias", noticias);
        model.addAttribute("tipo", type);

        return "noticias/index";
    }

    @RequestMapping("/noticias/add")
    public String addNoticia(Model model){

        model.addAttribute("noticia", new Noticia());

        return "noticias/add";
    }

    @PostMapping("/noticias/save")
    public String saveNoticia(Noticia noticia){
        
        noticiaService.save(noticia);
        return "redirect:/noticias?type=3";
    }

    @RequestMapping("/noticias/edit/{id}")
    public String editNoticia(@PathVariable("id") Integer id, Model model){
        model.addAttribute("noticia", noticiaService.getByID(id));

        return "noticias/add";
    }

    @RequestMapping("/noticias/view/{id}")
    public String viewNoticia(@PathVariable("id") Integer id, Integer type, Model model){
        model.addAttribute("noticia", noticiaService.getByID(id));
        model.addAttribute("tipo", type);
        return "noticias/view";
    }

    @RequestMapping("/noticias/delete/{id}")
    public String deleteNoticia(@PathVariable("id") Integer id){

        noticiaService.delete(id);
        return "redirect:/noticias?type=3";
    }
}