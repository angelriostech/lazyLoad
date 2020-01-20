package lazy.load.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import co.com.tns.lazy.load.manager.FileManager;

//@RunWith(MockitoJUnitRunner.class)
public class FileManagerTest {
	private static final String FILE_NAME = "hola.txt";
	File file = new File("C:\\projects\\lazy-load\\src\\main\\resources\\lazy_loading_example_input.txt");
	List<Integer> archivoEnTipoLista = Arrays.asList(5, 4, 30, 30, 1, 1, 3, 20, 20, 20, 11, 1, 2, 3, 4, 5, 6, 7, 8, 9,
			10, 11, 6, 9, 19, 29, 39, 49, 59, 10, 32, 56, 76, 8, 44, 60, 47, 85, 71, 91);
	// FileService service = new FileService();

	@Mock
	FileManager fileManager;

	@Test
	public void debeConvertirUnFileALista() throws FileNotFoundException {
		List<Integer> archivoListaResult = fileManager.convertirArchivoALista(file);
		assertEquals(archivoEnTipoLista, archivoListaResult);
	}

//	@Test
//	public void debeVaidarArchivoNoNulo() {
//		File file = new File(getClass().getClassLoader().getResource(FILE_NAME).getFile());
//		when(fileManager.isNotNullFile(file)).thenReturn(true);
//	}

	// service.upload(file);
	// FileManager fileManager = new FileManager();
	// fileManager.convertirArchivoALista(file);

}
