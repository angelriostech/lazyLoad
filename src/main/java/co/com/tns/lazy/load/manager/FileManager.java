package co.com.tns.lazy.load.manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.com.tns.lazy.load.exception.BusinessException;
import co.com.tns.lazy.load.util.Constants;

public class FileManager {

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

}
