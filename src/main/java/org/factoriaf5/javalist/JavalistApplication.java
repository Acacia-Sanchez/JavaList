package org.factoriaf5.javalist;

import java.util.List;
import java.util.ArrayList; 
import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavalistApplication {

	// 1. método para crear la lista de los días de la semana
	public List<String> creaListaDiasSemana() {
		List<String> listadias = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
/* 		listadias.add("Lunes");
		listadias.add("Martes");
		listadias.add("Miércoles");
		listadias.add("Jueves");
		listadias.add("Viernes");
		listadias.add("Sábado");
		listadias.add("Domingo"); */
		
		return listadias;
	}

	// 2. método que retorne los días de la semana
	public String muestraDiasSemana(String dia) {
		return null;
	}

	// 3. método que retorne el largo de la lista
	public String muestraLongitudLista(String dia) {
		return null;
	}

	// 4. método para eliminar un día de la semana
	public String eliminarDiaSemana(String dia) {
		return null;
	}

	// 5. método que retorne el día de la semana solicitado
	public String muestraDiaSemana(String dia) {
		return null;
	}

	// 6. método que retorne si el día solicitado existe en la lista
	public String existeDiaSemana(String dia) {
		return null;
	}

	// 7. método para ordenar la lista de días por orden alfabético
	public String ordenDiasSemana(String dia) {
		return null;
	}

	// 8. método para vaciar la lista
	public String vaciaListaDiasSemana(String dia) {
		return null;
	}

}

/// HACERLO CON Y SIN GETTERS Y SETTERS ****************