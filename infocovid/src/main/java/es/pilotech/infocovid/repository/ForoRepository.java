package es.pilotech.infocovid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.pilotech.infocovid.dominio.Publicacion;

public interface ForoRepository extends JpaRepository<Publicacion, Integer>{

    

}