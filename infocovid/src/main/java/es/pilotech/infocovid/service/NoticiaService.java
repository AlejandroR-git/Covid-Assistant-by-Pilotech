package es.pilotech.infocovid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.pilotech.infocovid.dominio.Noticia;
import java.util.List;
import es.pilotech.infocovid.repository.NoticiaRepository;

@Service
public class NoticiaService {
    
    @Autowired
    NoticiaRepository noticiaRepository;

    public List<Noticia> getAll(){
        return noticiaRepository.findAll();
    }

    public void save(Noticia n){
        noticiaRepository.saveAndFlush(n);
    }

    public void delete(Integer id){
        noticiaRepository.deleteById(id);
    }

    public Noticia getByID(Integer id){
        return noticiaRepository.getOne(id);
    }
}
