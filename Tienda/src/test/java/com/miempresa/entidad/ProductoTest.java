package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@DisplayName("Deberia crear un producto y precio válidos")
	void testCrearProductoValido() {
		String nombreEsperado = "Portátil";
		double precioEsperado = 500;
		
		assertEquals(nombreEsperado, Producto.getNombre());
	}

}
