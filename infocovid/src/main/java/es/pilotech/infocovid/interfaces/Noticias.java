package es.pilotech.infocovid.interfaces;

import es.pilotech.infocovid.dominio.Publicacion;
import es.pilotech.infocovid.dominio.Usuario;

public class Noticias implements Display{
    
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