package es.pilotech.infocovid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.pilotech.infocovid.dominio.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Integer>{

    

}