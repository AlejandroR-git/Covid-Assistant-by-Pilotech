package pilotech.dominio;

public class Invitado {
    
    // Variables que utilizamos para comprobar el estado de la cuenta del usuario
    private boolean registrado;
    private boolean mod;
    private boolean admin;

    public Invitado(){
        this.registrado = false;
        this.mod = false;
        this.admin = false;
    }

    public void abrirNoticias(){
        // TODO Función que abre la pestaña de noticias
    }

    public void abrirNoticia(int idPost){
        // TODO Función que abre una noticia de la lista de noticias
    }

    public void abrirForo(){
        // TODO Función que abre la pestaña del foro
    }

    public void abrirPost(int idPost){
        // TODO Función que abre una publicación del foro
    }

    public boolean isAdmin(){
        return this.admin;
    }

    public boolean isMod(){
        return this.mod;
    }

    public boolean isRegistered(){
        return this.registrado;
    }
}