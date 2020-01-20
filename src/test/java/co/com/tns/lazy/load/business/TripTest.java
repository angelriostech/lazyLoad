package co.com.tns.lazy.load.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.com.tns.lazy.load.domain.business.Trip;

public class TripTest {

	int lista[]= {50};
	Trip trip = new Trip();
	
	@Test
	public void debeContarLosViajes() {
		int actual = trip.retornarNumeroDeViajes(lista);
		assertEquals(1, actual);
	}
}
