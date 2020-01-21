package co.com.tns.lazy.load.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import co.com.tns.lazy.load.business.Trip;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.tns.lazy.load.exception.BusinessException;
import co.com.tns.lazy.load.manager.FileManager;
import co.com.tns.lazy.load.util.Constants;
import org.springframework.stereotype.Service;

@Service
public class FileService {


	@Autowired
	private FileManager fileManager;

	@Autowired
	private Trip trip;
	
	public FileService() {
		super();
	}
	
	public void upload(File file) throws FileNotFoundException {
		try {
			List<Integer> archivoEnTipoLista = fileManager.convertirArchivoALista(file);
			List<List> listSeparatedByListElements = fileManager.separateList(archivoEnTipoLista);
			String tripsByDay=" ";
			for (int i=0; i<listSeparatedByListElements.size(); i++)
			{
				tripsByDay= tripsByDay + " "+ String.valueOf
						(trip.retornarNumeroDeViajes(trip.sortListOfWeights(listSeparatedByListElements.get(i))));

			}
			//trip.retornarNumeroDeViajes(trip.sortListOfWeights(fileManager.showListOfElements(listSeparatedByListElements)));

		}catch (Exception exception) {
			throw new BusinessException(Constants.FILE_ERROR_NOT_FOUND, exception);
		}
	}
	
}
