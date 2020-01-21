package co.com.tns.lazy.load.controller;

import co.com.tns.lazy.load.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import co.com.tns.lazy.load.service.FileService;
import co.com.tns.lazy.load.util.FileUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping(Constants.BASE_PATH + "/file")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class FileController {

	@Autowired(required=true)
	private FileService service;

	@PostMapping("/upload")
	public String upload(@RequestPart(value = "file") MultipartFile file) throws FileNotFoundException {
		return service.upload(FileUtil.convertToFile(file));
	}

	//@RequestMapping(value = "/example", method = RequestMethod.GET)
	//@ResponseBody
	//public FileSystemResource getFile() {
	//	File file = new File("C:\\projects\\lazy-load\\src\\main\\resources\\lazy_loading_example_input.txt");
	//	return new FileSystemResource(file);
	//}

}
