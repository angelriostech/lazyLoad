package co.com.tns.lazy.load.manager;

import co.com.tns.lazy.load.business.Trip;
import co.com.tns.lazy.load.exception.BusinessException;
import co.com.tns.lazy.load.util.Constants;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
@Component
public class FileManager {

    @Autowired
    private Trip trip;

    public FileManager() {
        super();
    }

    private int apuntadorNumElemts = 0;

    public List<Integer> convertirArchivoALista(File file) throws FileNotFoundException {
        List<Integer> archivoEnTipoLista = new ArrayList<>();
        Scanner lector = new Scanner(file);
        try {
            while (lector.hasNextLine()) {
                String line = lector.nextLine();
                archivoEnTipoLista.add(Integer.parseInt(line.trim()));
            }
        } catch (Exception e) {
            throw new BusinessException(Constants.FILE_ERROR_LECTURE, e);
        } finally {
            lector.close();
        }
        return archivoEnTipoLista;
    }


    public List<Integer> separateList(List<Integer> list) { ;

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
        int elements = listElementsByDay.get(0);
        int numeroViajes = 0;
        for (int i = 0; i < elements; i++) {
            List<Integer> separateList = separateList(listElementsByDay);
            List<Integer> listaOrdenada = trip.sortListOfWeights(separateList);
            numeroViajes = trip.getNumeroDeViajes(listaOrdenada);
            tripsByDay = tripsByDay.concat(Constants.CASE_NUMBER).concat(String.valueOf(i + 1)).
                    concat( Constants.SYMBOL_COLON).concat(Constants.SPACE).
                    concat(String.valueOf(numeroViajes)).concat(Constants.LINE_BREACK);
        }
        setApuntadorNumElemts(0);
        return tripsByDay;

    }
}





