package es.pilotech.infocovid.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.Model;

import es.pilotech.infocovid.ConfiguradorInfocovid;
import es.pilotech.infocovid.dominio.Noticia;
import es.pilotech.infocovid.service.NoticiaService;

@SpringBootTest
@ContextConfiguration(classes = { ConfiguradorInfocovid.class })
class NoticiaControllerTest {

	@Mock
	private Model model;

	@Autowired
	NoticiaController noticiaController;

	@Autowired
	NoticiaService noticiaService;

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
	void CuandoLlamoAlPanelDeNoticiasDevuelveLaPestaña(){

		String direccion = noticiaController.listaNoticias(model, 0);

		assertEquals("noticias/index", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeCrearNoticiaDevuelveLaPestaña(){

		String direccion = noticiaController.addNoticia(model);

		assertEquals("noticias/add", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeGuardarNoticiaDevuelveLaPestaña(){

		Noticia n = new Noticia();
		
		String direccion = noticiaController.saveNoticia(n);

		assertEquals("redirect:/noticias?type=3", direccion);
		
	}

	@Test
	void CuandoLlamoAlPanelDeEditarUnaNoticiaDevuelveLaPestaña(){

		String direccion = noticiaController.editNoticia(0, model);

		assertEquals("noticias/add", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeVerUnaNoticiaDevuelveLaPestaña(){

		String direccion = noticiaController.viewNoticia(0, 0, model);

		assertEquals("noticias/view", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeBorrarUnaNoticiaDevuelveLaPestaña(){

		noticiaService.deleteAll();
		noticiaService.save(new Noticia());

		List<Noticia> ListaNoticias = noticiaService.getAll();
		int idnoticia = ListaNoticias.get(0).getId();

		String direccion = noticiaController.deleteNoticia(idnoticia);

		assertEquals("redirect:/noticias?type=3", direccion);

	}
}
