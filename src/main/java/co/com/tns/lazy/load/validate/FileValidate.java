package co.com.tns.lazy.load.validate;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FileValidate {

    public boolean isNullFile(File file) {
        return null == file;
    }

    public boolean isEmptyFile(File file) {
        return (!file.canRead());
    }

    public boolean isValidateTypeFile(String file) {
        String tipeFileTXT = file.substring(file.length() - 4);
        return (".TXT".equals(tipeFileTXT) || ".txt".equals(tipeFileTXT));
    }
}