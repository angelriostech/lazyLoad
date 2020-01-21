package co.com.tns.lazy.load.business;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * Para las operaciones de organizar listas y algoritmo de calcular viajes
 */

@Component
public class Trip {

	public static final int PESO_MINIMO_EN_BOLSA = 50;

	public Trip() {
		super();
	}

	public List<Integer> sortListOfWeights(List<Integer> listOfWeights) {
		Collections.sort(listOfWeights,Collections.reverseOrder());
		return listOfWeights;
	}

	public int retornarNumeroDeViajes(List<Integer> lista) {
		int numeroDeViajes = 0;
		int cantidadElemetosDisponibles = lista.size();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) >= PESO_MINIMO_EN_BOLSA) {
				numeroDeViajes += 1;
				cantidadElemetosDisponibles--;
			} else {
				if (cantidadElemetosDisponibles <= 1) {
					return numeroDeViajes;
				}
				else {
					int factorAumentoDePeso = 2;
					int pesoBolsa = 0;
					while (pesoBolsa < PESO_MINIMO_EN_BOLSA && cantidadElemetosDisponibles > 0) {
						pesoBolsa = lista.get(i) * factorAumentoDePeso;
						factorAumentoDePeso++;
						cantidadElemetosDisponibles--;
					}
					cantidadElemetosDisponibles--;
					numeroDeViajes++;
				}
			}
		}
		return numeroDeViajes;
	}

}
