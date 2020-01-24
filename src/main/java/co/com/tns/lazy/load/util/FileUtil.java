package co.com.tns.lazy.load.util;

import co.com.tns.lazy.load.exception.BusinessException;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class FileUtil {

    private FileUtil(){super();}

    private static FileOutputStream fos;

    public static File convertToFile(MultipartFile file) {
        try{
            File convFile = new File(file.getOriginalFilename());
            convFile.createNewFile();
            fos = new FileOutputStream(convFile);
            fos.write(file.getBytes());
            fos.close();
            return convFile;

        }catch (IOException e){
            throw new BusinessException(Constants.FILE_ERROR, e);
        }
    }
}
