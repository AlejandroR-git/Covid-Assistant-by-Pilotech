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

	@Test
	void test() {
		fail("Not yet implemented");
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
	void establecerID() {
		int id = 1;
		noticia.setId(id);
		assertEquals(id,noticia.getId());
	}

}
