package co.com.tns.lazy.load.validate;


import org.junit.Test;
import org.mockito.InjectMocks;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileValidateTest {

    @InjectMocks
    private FileValidate fileValidate;

    private File file = new File(getClass().getClassLoader().getResource("lazy_loading_example_input.txt").getFile());

    @Test
    public void mustValidateIsNotNullFile() {
        boolean resutlNullFile = fileValidate.isNullFile(file);
        assertEquals(false, resutlNullFile);
    }

}