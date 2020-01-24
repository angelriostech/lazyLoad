package co.com.tns.lazy.load.business;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class Trip {

	public void sortListOfWeights(List<Integer> listOfWeights) {
		Collections.sort(listOfWeights,Collections.reverseOrder());
	}

	public int getNumeroDeViajes(List<Integer> lista) {
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
