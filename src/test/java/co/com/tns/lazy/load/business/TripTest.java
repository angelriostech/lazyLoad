package co.com.tns.lazy.load.business;

import org.junit.jupiter.api.Test;

import co.com.tns.lazy.load.business.Trip;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class TripTest {

	private Trip trip = new Trip();

	@Test
	public void shouldSortAList() {
		List<Integer> listOfWeights = new ArrayList<Integer>();
		listOfWeights.add(5);
		listOfWeights.add(3);
		listOfWeights.add(12);
		listOfWeights.add(14);
		listOfWeights.add(1);
		
		List<Integer> listOfWeightsOrdered = new ArrayList<Integer>();
		listOfWeightsOrdered.add(14);
		listOfWeightsOrdered.add(12);
		listOfWeightsOrdered.add(5);
		listOfWeightsOrdered.add(3);
		listOfWeightsOrdered.add(1);
		
		trip.sortListOfWeights(listOfWeights);
		assertEquals(listOfWeights, listOfWeightsOrdered);
	}
	
	@Test
	public void debeContarLosViajes() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(50);
		int actual = trip.getNumeroDeViajes(lista);
		assertEquals(1, actual);
	}
}
