package co.com.tns.lazy.load.manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import co.com.tns.lazy.load.exception.BusinessException;
import co.com.tns.lazy.load.util.Constants;
import org.springframework.stereotype.Component;

@Component
public class FileManager {

	public FileManager() {
		super();
	}

	public List<Integer> convertirArchivoALista(File file) throws FileNotFoundException {
		List<Integer> archivoEnTipoLista = new ArrayList<>();
		Scanner lector = new Scanner(file);
		try {
			while (lector.hasNextLine()) {
				String line = lector.nextLine();
				archivoEnTipoLista.add(Integer.parseInt(line.trim()));
				System.out.println(line.trim());
			}
		} catch (Exception e) {
			throw new BusinessException(Constants.FILE_ERROR_LECTURE, e);
		} finally {
			lector.close();
		}
		return archivoEnTipoLista;
	}

	public List<List> separateList(List<Integer> list) {
		//   List<Integer> list = new ArrayList<>();
		int days = list.get(0);

		List<List> listDays = new ArrayList<>();

		int elements = 0;
		int position = 0;
		for (int i = 0; i < days; i++) {

			if (i > 0) {
				position++;
				elements = list.get(position + 1);
			} else if (i == 0) {
				elements = list.get(1);
			}
			List<Integer> listSeparate = new ArrayList<>();
			for (int j = 0; j < elements; j++) {

				listSeparate.add(j,list.get(position + 2));
				position++;

			}
			listDays.add(i, listSeparate);

		}
		return listDays;
	}





}
