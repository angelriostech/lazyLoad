package co.com.tns.lazy.load.business;

import java.util.Collections;
import java.util.List;

/**
 * Para las operaciones de organizar listas y algoritmo de calcular viajes
 */
public class Trip {

	public Trip() {
		super();
	}

	public List<Integer> sortListOfWeights(List<Integer> listOfWeights) {
		Collections.sort(listOfWeights);
		return listOfWeights;
	}

	public int retornarNumeroDeViajes(List<Integer> lista) {
		int incrementable = 0;
		int cantidadElemetosDisponibles = lista.size();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) >= 50) {
				incrementable += 1;
				cantidadElemetosDisponibles--;
			} else {
				if (cantidadElemetosDisponibles <= 1) {
					return incrementable;
				}

				else {
					int aumento = 2;
					int pesoBolsa = 0;
					while (pesoBolsa < 50 && cantidadElemetosDisponibles > 0) {
						pesoBolsa = lista.get(i) * aumento;
						aumento++;
						cantidadElemetosDisponibles--;
					}
					cantidadElemetosDisponibles--;
					incrementable++;
				}

			}

		}
		return incrementable;

	}

}
