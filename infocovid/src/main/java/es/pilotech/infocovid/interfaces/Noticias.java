package es.pilotech.infocovid.interfaces;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import es.pilotech.infocovid.dominio.Noticia;
import es.pilotech.infocovid.dominio.Publicacion;
import es.pilotech.infocovid.dominio.Usuario;

@Entity
public class Noticias implements Display{
    
    @Id
    @GeneratedValue
    private int id;
    
    @ManyToOne
    private Noticia listaNoticias;

    @Override
    public void display() {

    }

    @Override
    public void abrir(int id) {

    }

    public Publicacion getPost(int id){
        return null;
    }

    public void borrarPost(int id, Usuario user){

    }
    
    public void verificarPost(int id, Usuario user){

    }
}