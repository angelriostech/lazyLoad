package co.com.tns.lazy.load.manager;

import co.com.tns.lazy.load.business.Trip;
import co.com.tns.lazy.load.exception.BusinessException;
import co.com.tns.lazy.load.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class FileManager {
@Autowired
private Trip trip;
    public FileManager() {
        super();
    }
    private int apuntadorNumElemts=0;

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
    public String maximizeElementsByDay(List<Integer> listElementsByDay) {
        String tripsByDay = " ";
        List<List> separateList = separateList(listElementsByDay);

        for (int i = 0; i < listElementsByDay.size(); i++) {
           List<Integer> listaOrdenada = trip.sortListOfWeights(separateList.get(i));
            int numeroViajes = trip.retornarNumeroDeViajes(listaOrdenada);
            tripsByDay = tripsByDay + "Case #" + String.valueOf(i + 1) + ": " + String.valueOf
                   (numeroViajes) + "\n";
        }
        return tripsByDay;
    }

    public List<List> separateList(List<Integer> list) {
        int days = list.get(0);

        List<List> listDays = new ArrayList<>();

        int elements = 0;

        for (int i = 0; i < days; i++) {
            apuntadorNumElemts++;
            elements = list.get(apuntadorNumElemts);
            List<Integer> listSeparate = new ArrayList<>();
            for (int j = 0; j < elements; j++) {

                listSeparate.add(j, list.get(apuntadorNumElemts + 1));
                apuntadorNumElemts++;
            }
            listDays.add(i, listSeparate);
            return listDays;
        }

    }
}
