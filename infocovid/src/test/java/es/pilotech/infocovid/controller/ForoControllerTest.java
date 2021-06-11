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
import es.pilotech.infocovid.dominio.Publicacion;
import es.pilotech.infocovid.service.ForoService;

@SpringBootTest
@ContextConfiguration(classes = { ConfiguradorInfocovid.class })
class ForoControllerTest {

	@Mock
	private Model model;

	@Autowired
	ForoController foroController;


	@Autowired
	ForoService foroService;

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
	void CuandoLlamoAlPanelDeForoDevuelveLaPestaña(){

		String direccion = foroController.listaForo(model, 0);

		assertEquals("foro/index", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeCrearPublicacionDevuelveLaPestaña(){

		String direccion = foroController.addPost(model,0);

		assertEquals("foro/add", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeGuardarPublicacionDevuelveLaPestañaTipo1(){

		Publicacion p = new Publicacion();
		
		String direccion = foroController.savePost(p, 1);

		assertEquals("redirect:/foro?type=1", direccion);
		
	}
	@Test
	void CuandoLlamoAlPanelDeGuardarPublicacionDevuelveLaPestañaTipo2(){

		Publicacion p = new Publicacion();
		
		String direccion = foroController.savePost(p, 2);

		assertEquals("redirect:/foro?type=2", direccion);
		
	}

	@Test
	void CuandoLlamoAlPanelDeGuardarPublicacionDevuelveLaPestañaTipo3(){

		Publicacion p = new Publicacion();
		
		String direccion = foroController.savePost(p, 3);

		assertEquals("redirect:/foro?type=3", direccion);
		
	}


	@Test
	void CuandoLlamoAlPanelDeEditarUnaPublicacionDevuelveLaPestaña(){

		String direccion = foroController.editPost(0,0, model);

		assertEquals("foro/add", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeVerUnaPublicacionDevuelveLaPestaña(){

		String direccion = foroController.viewPost(0, 0, model);

		assertEquals("foro/view", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeBorrarUnaPublicacionDevuelveLaPestañaTipo1(){

		foroService.deleteAll();
		foroService.save(new Publicacion());

		List<Publicacion> ListaPublicacion = foroService.getAll();
		int idpublicacion = ListaPublicacion.get(0).getId();

		String direccion = foroController.deletePost(idpublicacion,1);

		assertEquals("redirect:/foro?type=1", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeBorrarUnaPublicacionDevuelveLaPestañaTipo2(){

		foroService.deleteAll();
		foroService.save(new Publicacion());

		List<Publicacion> ListaPublicacion = foroService.getAll();
		int idpublicacion = ListaPublicacion.get(0).getId();

		String direccion = foroController.deletePost(idpublicacion,2);

		assertEquals("redirect:/foro?type=2", direccion);

	}

	@Test
	void CuandoLlamoAlPanelDeBorrarUnaPublicacionDevuelveLaPestañaTipo3(){

		foroService.deleteAll();
		foroService.save(new Publicacion());

		List<Publicacion> ListaPublicacion = foroService.getAll();
		int idpublicacion = ListaPublicacion.get(0).getId();

		String direccion = foroController.deletePost(idpublicacion,3);

		assertEquals("redirect:/foro?type=3", direccion);

	}



}
