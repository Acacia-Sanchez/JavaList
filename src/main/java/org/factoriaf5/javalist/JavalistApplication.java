package org.factoriaf5.javalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// @SpringBootApplication
public class JavalistApplication {

	private List<String> miListaDias; // definida como atributo de clase para poder usarla en varios métodos

	// 1. método para crear la lista de los días de la semana
	public void creaListaDiasSemana() {
		// miListaDias.addAll(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
		miListaDias = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
	}

	// 2. método que retorne los días de la semana
	public List<String> muestraDiasSemana() {
		return miListaDias;
	}

	// 3. método que retorne el largo de la lista
	public Integer muestraLongitudLista() {
		return miListaDias.size();
	}

	// 4. método para eliminar un día de la semana
	public boolean eliminarDiaSemana(String dia) {
		return miListaDias.remove(dia);
	}

	// 5. método que retorne el día de la semana solicitado
	public String muestraDiaSemana(String dia) {
		return miListaDias.get(miListaDias.indexOf(dia));
	}

	// 6. método que retorne si el día solicitado existe en la lista
	public String existeDiaSemana(String dia) {
		if (miListaDias.contains(dia)) {
			return "El día " + dia + " existe";
		} else {
			return "El día " + dia + " no existe";
		}
	}

	// 7. método para ordenar la lista de días por orden alfabético
	public void ordenDiasSemana() {
		Collections.sort(miListaDias); // NECESITÉ IMPORTAR COLLECTIONS Y NO ME LO DIJO EN QUICK-FIX.... **** ¿??¿?¿?
	}

	// 8. método para vaciar la lista
	public void vaciaListaDiasSemana() {
		miListaDias.clear();
	}

}