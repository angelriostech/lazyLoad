package co.com.tns.lazy.load.service;

import co.com.tns.lazy.load.business.Trip;
import co.com.tns.lazy.load.exception.BusinessException;
import co.com.tns.lazy.load.manager.FileManager;
import co.com.tns.lazy.load.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class FileService implements IFileService {

    @Autowired
    private FileManager fileManager;

    @Autowired
    private Trip trip;

    public String maximizeElementsByDay(File file) {
        try {
            List<Integer> archivoEnTipoLista = fileManager.convertirArchivoALista(file);
            return fileManager.maximizeElementsByDay(archivoEnTipoLista);

        } catch (Exception exception) {
            throw new BusinessException(Constants.FILE_ERROR_LECTURE, exception);
        }
    }
}
