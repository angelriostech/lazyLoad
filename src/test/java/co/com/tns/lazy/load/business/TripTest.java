package co.com.tns.lazy.load.business;

import org.junit.jupiter.api.Test;

import co.com.tns.lazy.load.business.Trip;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TripTest {

	private Trip trip = new Trip();

	@Test
	public void shouldSortAList() {
		// Arrange
		int[] listOfWeights = { 5, 10, 15, 30, 2 };
		int[] listOfWeightsExpected = { 30, 15, 10, 5, 2 };
		// Act
		int[] listOfWeightsCurrent = trip.sortListOfWeights(listOfWeights);
		// Assert
		assertArrayEquals(listOfWeightsExpected, listOfWeightsCurrent);
	}
}
