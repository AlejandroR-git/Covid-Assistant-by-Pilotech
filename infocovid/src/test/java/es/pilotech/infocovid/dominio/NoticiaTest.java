package es.pilotech.infocovid.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class NoticiaTest {
	
	Noticia noticia;

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
		noticia = new Noticia();
	}
	
	@AfterEach
	public void terminate() {
		noticia = null;
	}
	
	@Test
	void trasEstablecerUnIdEseIdQuedaAlmacenadoEnLaNoticia() {
		int id = 1;
		noticia.setId(id);
		assertEquals(id,noticia.getId());
	}
	
	@Test
	void trasEstablecerUnTituloEseTituloQuedaAlmacenadoEnLaNoticia() {
		String titulo = "Titulo de la noticia";
		noticia.setTitular(titulo);
		assertEquals(titulo,noticia.getTitular());
	}
	
	@Test
	void trasEstablecerUnCuerpoEseCuerpoQuedaAlmacenadoEnLaNoticia() {
		String cuerpo = "Este es el cuerpo de la noticia";
		noticia.setCuerpo(cuerpo);
		assertEquals(cuerpo,noticia.getCuerpo());
	}
	
	@Test
	void trasEstablecerLaFuenteEsaFuenteQuedaAlmacenadaEnLaNoticia() {
		String fuente = "fuente de la noticia";
		noticia.setFuente(fuente);
		assertEquals(fuente,noticia.getFuente());
	}
	
	@Test
	void trasEstablecerElLinkEseLinkQuedaAlmacenadoEnLaNoticia() {
		String link = "www.linkdelanoticia.es";
		noticia.setLink(link);
		assertEquals(link,noticia.getLink());
	}
	
	@Test
	void trasEstablecerQueUnaNoticiaEsUnBuloSeQuedaAlmacenadaComoBulo() {
		boolean bulo = true;
		noticia.setBulo(bulo);
		assertEquals(bulo,noticia.isBulo());
	}
	
	void trasEstablecerUnTitularToStringDevuelveElTitularDeLaNoticia() {
		String titular = "Titular de la noticia";
		noticia.setTitular(titular);
		assertEquals(titular,noticia.toString());
	}

}
