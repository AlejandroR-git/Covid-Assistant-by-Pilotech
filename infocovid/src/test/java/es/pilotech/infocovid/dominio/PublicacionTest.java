package es.pilotech.infocovid.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PublicacionTest {
	Publicacion publicacion;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@BeforeEach
	public void init() {
		publicacion = new Publicacion();
	}
	
	@AfterEach
	public void terminate() {
		publicacion = null;
	}
	
	@Test
	void trasEstablecerUnIdEseIdQuedaAlmacenadoEnLaPublicacion() {
		int id = 1;
		publicacion.setId(id);
		assertEquals(id,publicacion.getId());
	}
	@Test
	void trasEstablecerUnTituloEseTituloQuedaAlmacenadoEnLaPublicacion() {
		String titulo = "Titulo de la publicacion";
		publicacion.setTitulo(titulo);
		assertEquals(titulo,publicacion.getTitulo());
	}



	@Test
	void trasEstablecerUnCuerpoEseCuerpoQuedaAlmacenadoEnLaPublicacion() {
		String cuerpo = "Este es el cuerpo de la publicacion";
		publicacion.setCuerpo(cuerpo);
		assertEquals(cuerpo,publicacion.getCuerpo());
	}

	@Test
	void trasEstablecerUnAutorEseAutorQuedaAlmacenadoEnLaPublicacion() {
		String autor= "Este es el autor de la publicacion";
		publicacion.setAutor(autor);
		assertEquals(autor,publicacion.getAutor());
	}


	@Test
	void trasEstablecerQueUnaPublicacionEstaVerificadaSeQuedaAlmacenado() {
		boolean verificado = true;
		publicacion.setVerificado(verificado);
		assertEquals(verificado,publicacion.isVerificado());
	}

	@Test
	void trasEstablecerUnUserIdEseIdQuedaAlmacenadoEnLaPublicacion() {
		int id = 1;
		publicacion.setUserID(id);
		assertEquals(id,publicacion.getUserID());
	}


}
