package es.pilotech.infocovid.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import es.pilotech.infocovid.ConfiguradorInfocovid;
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
		noticiaService.deleteAll();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void CuandoPidoLaListaDeNoticiasLaDevuelveCorrectamente() {

		List<Noticia> ListaNoticias = new ArrayList<Noticia>();
		
		Noticia n1 = new Noticia();
		Noticia n2 = new Noticia();
		Noticia n3 = new Noticia();

		ListaNoticias.add(n1);
		ListaNoticias.add(n2);
		ListaNoticias.add(n3);

		noticiaService.save(n1);
		noticiaService.save(n2);
		noticiaService.save(n3);

		assertEquals(ListaNoticias.size(), noticiaService.getAll().size());

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
		assertEquals(nsize+1, noticiaService.getAll().size());
	}

	@Test
	void CuandoBorroUnaNoticiaSeActualizaEnLaBaseDeDatos() {
		
		noticiaService.save(new Noticia());
		int nsize = noticiaService.getAll().size();
		List<Noticia> ListaNoticias = noticiaService.getAll();
		noticiaService.delete(ListaNoticias.get(0).getId());

		assertEquals(nsize-1, noticiaService.getAll().size());
	}

	@Test
	void CuandoBorroTodasLasNoticiasSeActualizaEnLaBaseDeDatos() {

		int n = 5; // Numero de noticias fantasma a añadir

		for(int i = 0; i<n; i++) noticiaService.save(new Noticia());

		noticiaService.deleteAll();

		assertEquals(0, noticiaService.getAll().size());
	}

	@Test
	void CuandoBuscoUnaNoticiaPorIDLaEncuentraCorrectamente() {

		Noticia noticia = new Noticia();
		noticiaService.save(noticia);
		
		List<Noticia> ListaNoticias = noticiaService.getAll();
		int idnoticia = ListaNoticias.get(0).getId();

		assertEquals(noticia.getId(), noticiaService.getByID(idnoticia).getId());
	}
}
