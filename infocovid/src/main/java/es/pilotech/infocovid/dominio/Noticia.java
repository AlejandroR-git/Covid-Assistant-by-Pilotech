package es.pilotech.infocovid.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Noticia{
	
	@Id
	@GeneratedValue
	private Integer id;
	private String titular;
	private String cuerpo;
	private String fuente;
	private String link;
	private boolean bulo;
	
	@ManyToOne
	private Noticia noticia;

	public Noticia() {
		
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public boolean isBulo() {
		return bulo;
	}

	public void setBulo(boolean bulo) {
		this.bulo = bulo;
	}

	public String toString(){
		return this.titular;
	}
	
	
}