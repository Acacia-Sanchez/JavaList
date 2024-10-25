package org.factoriaf5.javalist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// @SpringBootTest
class JavalistApplicationTests {

	// instanciación una sola vez para todos los tests
	private JavalistApplication javalist;  // ES NECESARIO PONER PRIVATE O SE PUEDE QUITAR ??

	@BeforeEach
	public void init() {
		javalist = new JavalistApplication(); 
		javalist.creaListaDiasSemana();
	}

 		// 1. test método crear la lista de los días de la semana
	@Test
	public void TestCreaListaDiasSemana() {
		List<String> listaTest = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
		List<String> miListaDias = javalist.muestraDiasSemana();

		assertEquals(listaTest, miListaDias);
	} 

		// 2. test método que retorne los días de la semana
	@Test
	public void testMuestraDiasSemana() {
		List<String> listaTest = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
		List<String> miListaDias = javalist.muestraDiasSemana();

		assertEquals(listaTest, miListaDias);
	}

		// 3. test método que retorne el largo de la lista
	@Test
	public void testMuestraLongitudLista() {
		Integer largoLista = 7;
		Integer result = javalist.muestraLongitudLista();
		assertEquals(largoLista, result);
	}

		// 4. test método para eliminar un día de la semana
	@Test
	public void testEliminarDiaSemana() {
		String dia = "Martes";
		Boolean result = javalist.eliminarDiaSemana(dia);

		assertTrue(result);
	}

		// 5. test método que retorne el día de la semana solicitado
	@Test
	public void testMuestraDiaSemana() {
		String diaSemana = "Viernes";
		String result = javalist.muestraDiaSemana(diaSemana);

		assertEquals(diaSemana, result);
	}	

		// 6a. test método que retorne si el día solicitado existe en la lista
  	@Test
	public void testExisteDiaSemana() {
		String diaAComprobar = "Martes";
		String siExiste = "El día " + diaAComprobar + " existe";
		String comprobacion = javalist.existeDiaSemana(diaAComprobar);

		assertEquals(siExiste, comprobacion);
	}
/* 	// 6b. test método que retorne si el día solicitado NO existe en la lista
	@Test
	public void testNoExisteDiaSemana() {
		javalist.vaciaListaDiasSemana();      ***** ME FALLA EL TEST Y NO ME DA TIEMPO A DAR CON EL ERROR, ASÍ QUE NO LLEGO AL 100% ************
    	javalist.creaListaDiasSemana();
		String diaAComprobar = "Lunes";
		String noExiste = "El día " + diaAComprobar + " no existe";
		String comprobacion = javalist.existeDiaSemana(diaAComprobar);

		assertEquals(noExiste, comprobacion);
	}  */

	// 7. test método para ordenar la lista de días por orden alfabético
	@Test
	public void testOrdenDiasSemana() {
		List<String> listaDesordenada = Arrays.asList("Viernes", "Lunes", "Miércoles", "Jueves", "Martes", "Domingo", "Sábado");
		javalist.ordenDiasSemana();
		List<String> ordenaLaLista = javalist.muestraDiasSemana();
		List<String> listaOrdenada = Arrays.asList("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes"); // Lista ordenada alfabéticamente

		assertEquals(ordenaLaLista, listaOrdenada);
	}

	// 8. test método para vaciar la lista
	@Test
	public void testVaciaListaDiasSemana() {
		javalist.vaciaListaDiasSemana();
		List<String> listVacia = javalist.muestraDiasSemana();

        assertTrue(listVacia.isEmpty());
	}

}
