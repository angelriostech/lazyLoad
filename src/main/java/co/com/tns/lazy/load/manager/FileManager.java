package co.com.tns.lazy.load.manager;

import co.com.tns.lazy.load.business.Trip;
import co.com.tns.lazy.load.exception.BusinessException;
import co.com.tns.lazy.load.util.Constants;
import co.com.tns.lazy.load.validate.FileValidate;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class FileManager {

    @Autowired
    private Trip trip;

    @Autowired
    private FileValidate validate;

    public List<Integer> convertFileToList(File file) {
        List<Integer> fileInTypeList = new ArrayList<>();
        try {
            Scanner lector = new Scanner(file);
            while (lector.hasNextLine()) {
                String line = lector.nextLine();
                fileInTypeList.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException exeption){
            throw new BusinessException(Constants.FILE_ERROR_LECTURE);
        }

        return fileInTypeList;
    }

    public void validatefile(File file) {
        if (!validate.isNullFile(file)) {
            throw new BusinessException(Constants.FILE_ERROR_NULL);
        }

        if (!validate.isEmptyFile(file)) {
            throw new BusinessException(Constants.FILE_ERROR_EMPTY);
        }

        if (!validate.isValidateTypeFile(file.getName())) {
            throw new BusinessException(Constants.FILE_ERROR_TYPE_NOT_TXT);
        }
    }

}