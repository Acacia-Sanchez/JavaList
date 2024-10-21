package org.factoriaf5.javalist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavalistApplicationTests {

	// instanciación una sola vez para todos los tests
	private JavalistApplication javalist;

	@BeforeEach
	public void init() {
		this.javalist = new JavalistApplication();
	}

	@Test
	// 1. método para crear la lista de los días de la semana
	public void TestCreaListaDiasSemana(String listadias) {
		List<String>
	}

	// 2. método que retorne los días de la semana
	public void TestMuestraDiasSemana(String dia) {

	}

	// 3. método que retorne el largo de la lista
	public void TestMuestraLongitudLista(String dia) {

	}

	// 4. método para eliminar un día de la semana
	public void TestEliminarDiaSemana(String dia) {

	}

	// 5. método que retorne el día de la semana solicitado
	public void TestMuestraDiaSemana(String dia) {

	}

	// 6. método que retorne si el día solicitado existe en la lista
	public void TestExisteDiaSemana(String dia) {

	}

	// 7. método para ordenar la lista de días por orden alfabético
	public void TestOrdenDiasSemana(String dia) {

	}

	// 8. método para vaciar la lista
	public void TestVaciaListaDiasSemana(String dia) {

	}

}
