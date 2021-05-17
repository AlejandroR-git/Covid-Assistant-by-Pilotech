package es.pilotech.infocovid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.pilotech.infocovid.dominio.Publicacion;
import java.util.List;
import es.pilotech.infocovid.repository.ForoRepository;

@Service
public class ForoService {
    
    @Autowired
    ForoRepository foroRepository;

    public List<Publicacion> getAll(){
        return foroRepository.findAll();
    }

    public void save(Publicacion post){
        foroRepository.saveAndFlush(post);
    }

    public void delete(Integer id){
        foroRepository.deleteById(id);
    }

    public Publicacion getByID(Integer id){
        return foroRepository.getOne(id);
    }
    
}
