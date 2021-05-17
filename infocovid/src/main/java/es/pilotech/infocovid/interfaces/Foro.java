package es.pilotech.infocovid.interfaces;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import es.pilotech.infocovid.dominio.Publicacion;

@Entity
public class Foro {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany (mappedBy = "post")
    private List<Publicacion> listaPosts;

}