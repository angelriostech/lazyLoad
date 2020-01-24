package co.com.tns.lazy.load.controller;

import co.com.tns.lazy.load.service.IFileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FileControllerTest {

    @InjectMocks
    private FileController fileController;

    @Mock
    IFileService service;

    @Test
    public void mustCallToFileServiceInUpload(){
        fileController.upload(any());
        verify(service.maximizeElementsByDay(any()), times(1));
    }
}
