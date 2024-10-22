package org.factoriaf5.javalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;



@SpringBootTest
class JavalistApplicationTests {

	// instanciación una sola vez para todos los tests
	private JavalistApplication javalist;

	@BeforeEach
	public void init() {
		this.javalist = new JavalistApplication();
	}

		// 1. test método crear la lista de los días de la semana
	@Test
	public void TestCreaListaDiasSemana() {
		List<String> listadiasesperados = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
		List<String> listadias = new ArrayList<>();
		javalist.creaListaDiasSemana(listadias);
		assertEquals(listadiasesperados, listadias);
	}

		// 2. test método que retorne los días de la semana
	@Test
	public void TestMuestraDiasSemana(String dia) {

	}

		// 3. test método que retorne el largo de la lista
	@Test
	public void TestMuestraLongitudLista(String dia) {

	}

		// 4. test método para eliminar un día de la semana
	@Test
	public void TestEliminarDiaSemana(String dia) {

	}

		// 5. test método que retorne el día de la semana solicitado
	@Test
	public void TestMuestraDiaSemana(String dia) {

	}

		// 6. test método que retorne si el día solicitado existe en la lista
	@Test
	public void TestExisteDiaSemana(String dia) {

	}

		// 7. test método para ordenar la lista de días por orden alfabético
	@Test
	public void TestOrdenDiasSemana(String dia) {

	}

		// 8. test método para vaciar la lista
	@Test
	public void TestVaciaListaDiasSemana(String dia) {

	}

}
