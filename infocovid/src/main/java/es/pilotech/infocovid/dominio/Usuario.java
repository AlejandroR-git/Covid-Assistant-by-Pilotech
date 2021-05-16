package es.pilotech.infocovid.dominio;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario extends Invitado{
    
    // Variables que guardan información sobre la cuenta del usuario
    @Id
    @GeneratedValue
    private int id;
    
    private String nombre;
    private String correo;
    private String password;
    private String ciudad;
    private Date fechaReg;

    @OneToMany (mappedBy = "userPost")
    private List<Publicacion> listaPosts;

    public Usuario(String nombre, String correo, String password, String ciudad, int id, Date fechaReg){
        super();
        this.setRegistered();
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.ciudad = ciudad;
        this.id = id;
        this.fechaReg = fechaReg;
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

    public boolean hasPost(Publicacion post){
        return listaPosts.contains(post);
    }

}
