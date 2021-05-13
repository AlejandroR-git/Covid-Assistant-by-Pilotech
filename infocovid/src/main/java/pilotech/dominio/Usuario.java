package pilotech.dominio;

import java.sql.Date;
import java.util.Arrays;

public class Usuario extends Invitado{
    
    // Variables que guardan información sobre la cuenta del usuario
    private String nombre;
    private String correo;
    private String contraseña;
    private String ciudad;
    private int id;
    private Date fechaReg;
    private int numPosts; // Hará falta hacer un getPost(id) ?
    private int[] idPosts;

    public Usuario(String nombre, String correo, String contraseña, String ciudad, int id, Date fechaReg){
        this.setRegistered();
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.ciudad = ciudad;
        this.id = id;
        this.fechaReg = fechaReg;
        this.numPosts = 0;
        this.idPosts = new int[0];
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }
    
    public int getNumPosts() {
        return numPosts;
    }

    public void setNumPosts(int numPosts) {
        this.numPosts = numPosts;
    }

    public int[] getIDPosts(){
        return this.idPosts;
    }

    // Comprueba si el usuario ha creado la publicación indicada por su id
    public boolean hasPost(int id){
        return Arrays.binarySearch(this.idPosts, id) >= 0;
    }

    public void addIDPost(int id){
        // TODO Añadir la id de un post a la lista de publicaciones del usuario
        
        this.numPosts++;
    }

}
