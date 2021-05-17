package es.pilotech.infocovid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String addPost(Model model){

        model.addAttribute("post", new Publicacion());

        return "foro/add";
    }

    @PostMapping("/foro/save")
    public String savePost(Publicacion post){
    
        foroService.save(post);
        return "redirect:/foro";
    }

    @RequestMapping("/foro/edit/{id}")
    public String editPost(@PathVariable("id") Integer id, Model model){
        model.addAttribute("post", foroService.getByID(id));
        return "foro/add";
    }

    @RequestMapping("/foro/view/{id}")
    public String viewPost(@PathVariable("id") Integer id, Model model){
        model.addAttribute("post", foroService.getByID(id));
        return "foro/view";
    }

    @RequestMapping("/foro/verif")
    public String viewVerifPanel(Model model){

        boolean notVerif = false;
        int cont = 0;
        List<Publicacion> publicaciones = foroService.getAll();
        
        while(cont<publicaciones.size() && !notVerif){
            if(!publicaciones.get(cont).isVerificado())
                notVerif = true;
            cont++;
        }
        model.addAttribute("listaPosts", publicaciones);
        model.addAttribute("notVerif", notVerif);

        return "foro/verif/index";
    }

    @RequestMapping("/foro/verif/view/{id}")
    public String viewVerifPost(@PathVariable("id") Integer id, Model model){
        
        model.addAttribute("post", foroService.getByID(id));
        
        return "foro/verif/view";
    }

    @RequestMapping("/foro/verif/save/{id}")
    public String saveVerifPost(@PathVariable("id") Integer id){
    
        Publicacion post = foroService.getByID(id);
        post.setVerificado(true);
        foroService.save(post);
        return "redirect:/foro";
    }

    @RequestMapping("/foro/delete/{id}")
    public String deletePost(@PathVariable("id") Integer id){

        foroService.delete(id);
        return "redirect:/foro";
    }
}