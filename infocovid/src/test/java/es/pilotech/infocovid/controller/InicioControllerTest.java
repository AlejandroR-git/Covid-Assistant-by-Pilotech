package es.pilotech.infocovid.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

@SpringBootTest
@ContextConfiguration(classes = { ConfiguradorInfocovid.class })
class InicioControllerTest {

	@Mock
	private Model model;

	@Autowired
	InicioController inicioController;

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
	void CuandoLlamoAlPanelDeIncioDevuelveLaPestaña(){

		String direccion = inicioController.inicio(model, 0);
		
		assertEquals("inicio", direccion);
		
	}

	@Test
	void CuandoLlamoAlPanelDeContactoConAutoridadesDevuelveLaPestaña(){

		String direccion = inicioController.contactoAutoSanitarias(model, 0);
		
		assertEquals("info", direccion);
		
	}

}
