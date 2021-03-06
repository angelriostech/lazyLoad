package co.com.tns.lazy.load.business;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class Trip {

	public void sortListOfWeights(List<Integer> listOfWeights) {
		Collections.sort(listOfWeights,Collections.reverseOrder());
	}

	public int getNumberOfTrips(List<Integer> lista) {
		int numberTrips = 0;
		int availableObjects = lista.size();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) >= 50) {
				numberTrips += 1;
				availableObjects--;
			} else {
				if (availableObjects <= 1) {
					return numberTrips;
				}
				else {
					int magnificationFactor = 2;
					int bagWight = 0;
					while (bagWight < 50 && availableObjects > 0) {
						bagWight = lista.get(i) * magnificationFactor;
						magnificationFactor++;
						availableObjects--;
					}
					availableObjects--;
					numberTrips++;
				}
			}
		}
		return numberTrips;
	}
}
