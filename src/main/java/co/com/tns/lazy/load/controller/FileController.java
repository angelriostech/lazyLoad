package co.com.tns.lazy.load.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FileController {

    //@Autowired
    //private FileService service;


    @PostMapping("/upload")
    public void upload(@RequestPart(value = "file") MultipartFile file) throws IOException {
        //return service.upload(FileUtil.convert(file));

    }

}
