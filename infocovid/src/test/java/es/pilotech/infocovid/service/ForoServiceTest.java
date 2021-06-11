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
import es.pilotech.infocovid.dominio.Noticia;
import es.pilotech.infocovid.dominio.Publicacion;

@SpringBootTest
@ContextConfiguration(classes = { ConfiguradorInfocovid.class })
class ForoServiceTest {

	@Autowired
 	private ForoService foroService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		foroService.deleteAll();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void CuandoPidoLaListaDeNoticiasLaDevuelveCorrectamente() {

		List<Publicacion> ListaPosts = new ArrayList<Publicacion>();
		
		Publicacion p1 = new Publicacion();
		Publicacion p2 = new Publicacion();
		Publicacion p3 = new Publicacion();;

		ListaPosts.add(p1);
		ListaPosts.add(p2);
		ListaPosts.add(p3);

		foroService.save(p1);
		foroService.save(p2);
		foroService.save(p3);

		assertEquals(ListaPosts.size(), foroService.getAll().size());

	}

	@Test
	void CuandoGuardoUnaNoticiaSeAlmacenaEnLaBaseDeDatos() {

		int nsize = foroService.getAll().size();
		Publicacion p = new Publicacion();

		p.setTitulo("Titulo");
		p.setCuerpo("cuerpo");
		p.setAutor("autor");
		p.setVerificado(true);

		foroService.save(p);
		assertEquals(nsize+1, foroService.getAll().size());
	}

	@Test
	void CuandoBorroUnaNoticiaSeActualizaEnLaBaseDeDatos() {
		
		foroService.save(new Publicacion());
		int nsize = foroService.getAll().size();
		List<Publicacion> ListaPosts = foroService.getAll();
		foroService.delete(ListaPosts.get(0).getId());

		assertEquals(nsize-1, foroService.getAll().size());
	}

	@Test
	void CuandoBorroTodasLasNoticiasSeActualizaEnLaBaseDeDatos() {

		int n = 5; // Numero de noticias fantasma a añadir

		for(int i = 0; i<n; i++) foroService.save(new Publicacion());

		foroService.deleteAll();

		assertEquals(0, foroService.getAll().size());
	}

	@Test
	void CuandoBuscoUnaNoticiaPorIDLaEncuentraCorrectamente() {

		Publicacion p = new Publicacion();
		p.setTitulo("titular");
		foroService.save(p);
		List<Publicacion> ListaPosts = foroService.getAll();
		int idnoticia = ListaPosts.get(0).getId();

		assertEquals(p.getId(), foroService.getByID(idnoticia).getId());
	}

	

}
