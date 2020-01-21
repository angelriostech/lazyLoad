package co.com.tns.lazy.load.controller;

import co.com.tns.lazy.load.service.FileService;
import co.com.tns.lazy.load.util.Constants;
import co.com.tns.lazy.load.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;

@RestController
@RequestMapping(Constants.BASE_PATH + "/file")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class FileController {

	@Autowired
	private FileService service;

	@PostMapping("/upload")
	public String upload(@RequestPart(value = "file") MultipartFile file) throws FileNotFoundException {
		return service.upload(FileUtil.convertToFile(file));
	}
}
