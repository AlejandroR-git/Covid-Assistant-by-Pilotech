package pilotech.dominio;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

public class Usuario extends Invitado{
    
    // Variables que guardan información sobre la cuenta del usuario
    private String nombre;
    private String correo;
    private String password;
    private String ciudad;
    private int id;
    private Date fechaReg;
    private List<Integer> idPosts;

    public Usuario(String nombre, String correo, String password, String ciudad, int id, Date fechaReg){
        super();
        this.setRegistered();
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.ciudad = ciudad;
        this.id = id;
        this.fechaReg = fechaReg;
        this.idPosts = new ArrayList<Integer>();
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

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
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

    public List<Integer> getIDPosts(){
        return this.idPosts;
    }

    // Comprueba si el usuario ha creado la publicación indicada por su id
    public boolean hasPost(int id){
        return this.idPosts.contains(id);
    }

    // Añade la id de un post a la lista de publicaciones del usuario
    public void addIDPost(int id){
        idPosts.add(id);
    }

    // Borra la id de un post a la lista de publicaciones del usuario
    public void removeIDPost(int id){
        idPosts.remove(idPosts.indexOf(id));
    }

}
