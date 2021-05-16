package es.pilotech.infocovid.dominio;

public class Publicacion{
	private int id;
	private String titulo;
	private String cuerpo;
	private Usuario autor;
	private boolean verificado;
	private int userID;

	public Publicacion(int id, String titulo, String cuerpo, Usuario autor, boolean verificado, int userID) {
		this.id = id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.autor = autor;
		this.verificado = verificado;
		this.userID = userID;
	}
	
	public void crearPost(Usuario user) {
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}   
    
}