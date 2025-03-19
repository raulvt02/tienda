package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Realización de la prueba unitaria de la entidad producto")

class ProductoTest {
	
	Producto producto;

	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto("Portátil", 500);
	}

	@Test
	@DisplayName("Deberia crear un producto y precio válidos")
	void testCrearProductoValido() {
		String nombreEsperado = "Portátil";
		double precioEsperado = 500;
		
		assertEquals(nombreEsperado, producto.getNombre());
		assertEquals(precioEsperado, producto.getPrecio());
	}
	
	@Test
	@DisplayName("Debería lanzar una excepción cuando al crear un producto el precio sea negativo")
	void testCrearUnProductoInvalidoPrecio() {
		Exception exception = assertThrows(IllegalArgumentException.class, ()->{new Producto("PC", -3);});
		double precioEsperado = -3.0;
		String mensajeEsperado = "El precio no puede ser negativo: " + precioEsperado;
		
		assertEquals(mensajeEsperado, exception.getMessage());
	}
	
	@Test
	@DisplayName("Deberia modificar el nombre del producto")
	void testModificarNombreProducto() {
		String nombreEsperado = "Monitor";
		producto.setNombre("Monitor");
		
		assertEquals(nombreEsperado, producto.getNombre());
	}
	
	@Test
	@DisplayName("Deberia modificar el precio del producto")
	void testModificarPrecioProducto() {
		double precioEsperado = 50;
		producto.setPrecio(50);
		
		assertEquals(precioEsperado, producto.getPrecio());
	}
	
	@Test
	@DisplayName("Deberia lanzar una excepción al intentar establecer un precio negativo")
	void testModificarPrecioNegativo() {
		Exception exception = assertThrows(IllegalArgumentException.class, ()->producto.setPrecio(-50));
		double precioEsperado = -50;
		String mensajeEsperado = "El precio no puede ser negativo: " + precioEsperado;
		
		assertEquals(mensajeEsperado, exception.getMessage());
	}

}
