package co.com.tns.lazy.load.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.tns.lazy.load.exception.BusinessException;
import co.com.tns.lazy.load.manager.FileManager;
import co.com.tns.lazy.load.util.Constants;

public class FileService {

	@Autowired
	private FileManager fileManager;
	
	public FileService() {
		super();
	}
	
	public void upload(File file) throws FileNotFoundException {
		try {
			List<Integer> archivoEnTipoLista = fileManager.convertirArchivoALista(file);
			
		}catch (Exception exception) {
			throw new BusinessException(Constants.FILE_ERROR_NOT_FOUND, exception);
		}
	}
	
}
