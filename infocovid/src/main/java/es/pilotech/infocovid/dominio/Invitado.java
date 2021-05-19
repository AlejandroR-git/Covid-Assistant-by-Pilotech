package es.pilotech.infocovid.dominio;

public class Invitado {
    
    // Variables que utilizamos para comprobar el estado de la cuenta del usuario
    protected boolean registrado;
    protected boolean mod;
    protected boolean admin;

    public Invitado(){
        this.registrado = false;
        this.mod = false;
        this.admin = false;
    }

    public boolean isAdmin(){
        return this.admin;
    }

    public void setAdmin(boolean info){
        this.admin = info;
    }

    public boolean isMod(){
        return this.mod;
    }

    public void setMod(boolean info){
        this.mod = info;
    }

    public boolean isRegistered(){
        return this.registrado;
    }

    public void setRegistered(){
        this.registrado = true;
    }
}