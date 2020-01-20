package co.com.tns.lazy.load.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import co.com.tns.lazy.load.manager.FileManager;

public class FileService {

	@Autowired
	private FileManager fileManager;

	public void upload(File file) throws FileNotFoundException {

		List<Integer> archivoEnTipoLista = fileManager.convertirArchivoALista(file);

	}
}
