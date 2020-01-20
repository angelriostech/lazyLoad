package co.com.tns.lazy.load.domain.busniess;

import co.com.tns.lazy.load.business.Trip;
//import co.com.tns.lazy.load.domain.business.Manager;
import co.com.tns.lazy.load.manager.FileManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


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

