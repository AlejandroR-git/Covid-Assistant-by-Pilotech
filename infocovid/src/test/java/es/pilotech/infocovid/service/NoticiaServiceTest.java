package es.pilotech.infocovid.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import es.pilotech.infocovid.dominio.Noticia;

@SpringBootTest
@ContextConfiguration(classes = { ConfiguradorInfocovid.class })
class NoticiaServiceTest {

	@Autowired
 	private NoticiaService noticiaService;

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

	@Test
	void CuandoGuardoUnaNoticiaSeAlmacenaEnLaBaseDeDatos() {

		int nsize = noticiaService.getAll().size();
		Noticia noticia = new Noticia();

		noticia.setTitular("Titulo");
		noticia.setCuerpo("cuerpo");
		noticia.setFuente("fuente");
		noticia.setLink("https://informatica.cv.uma.es/");
		noticia.setBulo(false);

		noticiaService.save(noticia);
		assertEquals(noticiaService.getAll().size(), nsize+1);
	}

}
