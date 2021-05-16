package es.pilotech.infocovid.interfaces;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import es.pilotech.infocovid.dominio.Noticia;
import es.pilotech.infocovid.dominio.Publicacion;
import es.pilotech.infocovid.dominio.Usuario;

@Entity
public class Foro implements Display{

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany (mappedBy = "post")
    private List<Publicacion> listaPosts;

    @Override
    public void display() {

    }

    @Override
    public void abrir(int id) {

    }

    public Noticia getNoticia(int id){
        return null;
    }

    public void borrarNoticia(int id, Usuario user){

    }

    public Noticia editarNoticia(int id, Usuario user){
        return null;
    }
}