package es.pilotech.infocovid.interfaces;

import es.pilotech.infocovid.dominio.Noticia;
import es.pilotech.infocovid.dominio.Usuario;

public class Foro implements Display{


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