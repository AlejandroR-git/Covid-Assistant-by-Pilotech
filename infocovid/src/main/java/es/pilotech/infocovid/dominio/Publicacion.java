package es.pilotech.infocovid.dominio;

public class Publicacion{

    private int userID;

    public boolean userHasPost(int id){
        return userID == id;
    }
    
}