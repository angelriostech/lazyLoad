package co.com.tns.lazy.load.service;

import co.com.tns.lazy.load.business.LazyLoad;
import co.com.tns.lazy.load.business.Trip;
import co.com.tns.lazy.load.manager.FileManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class FileService implements IFileService {

    @Autowired
    private FileManager fileManager;

    @Autowired
    private LazyLoad lazyLoad;

    public String maximizeElementsByDay(File file) {
        //fileManager.validatefile(file);
        List<Integer> archivoEnTipoLista = fileManager.convertFileToList(file);
        return lazyLoad.maximizeElementsByDay(archivoEnTipoLista);
    }
}
