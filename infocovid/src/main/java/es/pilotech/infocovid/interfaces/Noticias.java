package es.pilotech.infocovid.interfaces;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import es.pilotech.infocovid.dominio.Noticia;

@Entity
public class Noticias {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @OneToMany (mappedBy = "noticia")
    private List<Noticia> listaNoticias;

}