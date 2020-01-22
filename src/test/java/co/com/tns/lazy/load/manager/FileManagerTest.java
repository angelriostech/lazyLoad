package co.com.tns.lazy.load.manager;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FileManagerTest {
	FileManager fileManager = new FileManager();

	@Test
	public void debeConvertirUnFileALista() throws FileNotFoundException {
		File file = new File(getClass().getClassLoader().getResource("lazy_loading_example_input.txt").getFile());
		List<Integer> archivoEnTipoLista = Arrays.asList(5, 4, 30, 30, 1, 1, 3, 20, 20, 20, 11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 6, 9, 19, 29, 39, 49, 59, 10, 32, 56, 76, 8, 44, 60, 47, 85, 71, 91);
		List<Integer>  archivoEnTipoListaResult = fileManager.convertirArchivoALista(file);
		assertEquals(archivoEnTipoLista, archivoEnTipoListaResult);
	}

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
		List<List> resultado = fileManager.separateList(list);

		Assert.assertEquals(object, resultado.get(0));
	}
}