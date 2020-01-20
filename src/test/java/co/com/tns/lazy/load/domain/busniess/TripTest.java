package co.com.tns.lazy.load.domain.busniess;

import co.com.tns.lazy.load.domain.business.Manager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class TripTest {


    @Test
    public void youMustSeparateAList() {

        int []list = {4,4,30,29,12,1,2,3,4,3,9,10,11,5,45,46,47,48,49};
        //ArrayList<Integer> listElements = new ArrayList<>();

        Manager manager = new Manager();

        int[][]resultado =manager.separateList(list);

        assertEquals(49,resultado[3][4],0.0001);

    }
}
