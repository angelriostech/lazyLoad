package co.com.tns.lazy.load.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import co.com.tns.lazy.load.manager.FileManager;

//@RunWith(MockitoJUnitRunner.class)
public class FileManagerTest {

	FileManager manager = new FileManager();
	private static final String FILE_NAME = "hola.txt";
	private File file = new File("C:\\projects\\lazy-load\\src\\main\\resources\\lazy_loading_example_input.txt");
	private List<Integer> archivoEnTipoLista = Arrays.asList(5, 4, 30, 30, 1, 1, 3, 20, 20, 20, 11, 1, 2, 3, 4, 5, 6, 7, 8, 9,
			10, 11, 6, 9, 19, 29, 39, 49, 59, 10, 32, 56, 76, 8, 44, 60, 47, 85, 71, 91);
	Scanner lector;

	// FileService service = new FileService();

	@Mock
	FileManager fileManager;

	//@Test
	//public void debeConvertirUnFileALista() throws FileNotFoundException {
	//	List<Integer> archivoListaResult = fileManager.convertirArchivoALista(file);
	//	assertEquals(archivoEnTipoLista, archivoListaResult);
	//}

//	@Test
//	public void debeVaidarArchivoNoNulo() {
//		File file = new File(getClass().getClassLoader().getResource(FILE_NAME).getFile());
//		when(fileManager.isNotNullFile(file)).thenReturn(true);
//	}

	// service.upload(file);
	// FileManager fileManager = new FileManager();
	// fileManager.convertirArchivoALista(file);


	@Test
	public void youMustSeparateAList() {

		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(4);
		list.add(30);
		list.add(29);
		list.add(12);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(5);
		list.add(45);
		list.add(46);
		list.add(47);
		list.add(48);
		list.add(49);
		List<Integer> object = new ArrayList<>();
		object.add(30);
		object.add(29);
		object.add(12);
		object.add(1);
		List<List> resultado = manager.separateList(list);
		assertEquals(49,resultado.get(3).get(4));

	}
	@Test
	public  void shouldReturnOneListElements() {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(4);
		list.add(30);
		list.add(29);
		list.add(12);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(5);
		list.add(45);
		list.add(46);
		list.add(47);
		list.add(48);
		list.add(49);
		List<Integer> object = new ArrayList<>();
		object.add(30);
		object.add(29);
		object.add(12);
		object.add(1);
		List<List> listOfElements = manager.separateList(list);
	//	manager.listOfElements(listOfElements);
	}

}