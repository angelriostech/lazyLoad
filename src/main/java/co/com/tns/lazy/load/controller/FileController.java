package co.com.tns.lazy.load.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import co.com.tns.lazy.load.service.FileService;
import co.com.tns.lazy.load.util.FileUtil;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("" + "/flights")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class FileController {

	@Autowired
	private FileService service;

	@PostMapping("/upload")
	public void upload(@RequestPart(value = "file") MultipartFile file) throws FileNotFoundException {
		service.upload(FileUtil.convertToFile(file));
	}

}
