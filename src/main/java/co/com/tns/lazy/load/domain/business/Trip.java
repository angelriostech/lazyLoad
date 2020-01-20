package co.com.tns.lazy.load.domain.business;

/**
 * Para las operaciones de organizar listas y algoritmo de calcular viajes
 */
public class Trip {

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
