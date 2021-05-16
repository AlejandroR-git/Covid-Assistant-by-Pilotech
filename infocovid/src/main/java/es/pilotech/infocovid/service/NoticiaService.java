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

}
