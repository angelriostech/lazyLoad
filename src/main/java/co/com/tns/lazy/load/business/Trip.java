package co.com.tns.lazy.load.business;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Para las operaciones de organizar listas y algoritmo de calcular viajes
 */
public class Trip {

	public int[] sortListOfWeights(int[] listOfWeights) {
		int[] listOfWeightsSorted = new int[listOfWeights.length];
		for (int i = 0; i < listOfWeights.length; i++) {
			listOfWeightsSorted[i] = max(listOfWeights);
			for (int j = 0; j < listOfWeights.length - 1; j++) {
				if (listOfWeights[j] == max(listOfWeights)) {
					listOfWeights[j] = 0;
				}
			}
		}
		return listOfWeightsSorted;

	}

	public int retornarNumeroDeViajes(int[] lista) {
		int incrementable = 0;
		int cantidadElemetosDisponibles = lista.length;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] >= 50) {
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
						pesoBolsa = lista[i] * aumento;
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
