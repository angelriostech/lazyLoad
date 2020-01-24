package co.com.tns.lazy.load.business;

import co.com.tns.lazy.load.util.Constants;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class LazyLoad {

    @Autowired
    private Trip trip;

    private int apuntadorNumElemts = 0;

    public List<Integer> separateList(List<Integer> list) {
        List<Integer> listDays = new ArrayList<>();
        int elements = 0;
        this.apuntadorNumElemts++;
        elements = list.get(this.apuntadorNumElemts);

        List<Integer> listSeparate = new ArrayList<>();
        for (int j = 0; j < elements; j++) {
            listSeparate.add(j, list.get(this.apuntadorNumElemts + 1));
            this.apuntadorNumElemts++;
        }

        return listSeparate;
    }

    public String maximizeElementsByDay(List<Integer> listElementsByDay) {
        String tripsByDay = "";
        int totalDays = listElementsByDay.get(0);
        int numeroViajes = 0;
        for (int day = 0; day < totalDays; day++) {
            List<Integer> weightsOfDay = separateList(listElementsByDay);
            trip.sortListOfWeights(weightsOfDay);
            numeroViajes = trip.getNumberOfTrips(weightsOfDay);
            tripsByDay = tripsByDay.concat(Constants.CASES_NUMBER).concat(String.valueOf(day + 1)).
                    concat(Constants.SYMBOL_COLON).concat(Constants.SPACE).
                    concat(String.valueOf(numeroViajes)).concat(Constants.LINE_BREACK);
        }
        setApuntadorNumElemts(0);

        return tripsByDay;
    }
}
