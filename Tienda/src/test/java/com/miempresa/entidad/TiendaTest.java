package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TiendaTest {
	
	private Tienda tienda;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	

	@BeforeEach
	void setUp() throws Exception {
		tienda = new Tienda();
		producto1 = new Producto("Portatil", 1200.50);
		producto2 = new Producto("Ratón", 25.00);
		producto3 = new Producto("Monitor", 200.50);
	}

	@Test
	@DisplayName("Debería agregar producto a la tienda")
	void testAgregarProductos() {
		Integer totalEsperado = 3;
		tienda.agregarProducto(producto1);
		tienda.agregarProducto(producto2);
		tienda.agregarProducto(producto3);
		
		assertEquals(totalEsperado, tienda.obtenerProductos().size(), "No coincide el total de producto con el tamaño de la lista");
		
	}

	@Test
	@DisplayName("Deberia devolver los valores correctos")
	void testDevolverValoresCorrectos() {
		tienda.agregarProducto(producto1);
		
		assertEquals("Portatil", tienda.obtenerProductos().get(0).getNombre());
		assertEquals(1200.50, tienda.obtenerProductos().get(0).getPrecio());
	}
	
	@Test
	@DisplayName("Deberia devolver el precio total de los productos")
	void testDevolverPrecioTotal() {
		double totalEsperado = 1426.00;
		
		tienda.agregarProducto(producto1);
		tienda.agregarProducto(producto2);
		tienda.agregarProducto(producto3);
		
		assertEquals(totalEsperado, tienda.calcularPrecioTotal());
	}
}
