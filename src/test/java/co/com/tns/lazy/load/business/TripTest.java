package co.com.tns.lazy.load.business;

import co.com.tns.lazy.load.domain.business.Trip;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripTest {


    private Trip trip = new Trip();

    @Test
    public void shouldSortAList(){
        //Arrange
        int [] listOfWeights = {5,10,15,30,2};
        int [] listOfWeightsExpected = {30,15,10,5,2};
        //Act
        int [] listOfWeightsCurrent = trip.sortListOfWeights(listOfWeights);
        //Assert
        Assert.assertArrayEquals(listOfWeightsExpected,listOfWeightsCurrent);
    }
}
