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
	public void shouldReturnAListOnlyWeights() {
		List<Integer> listElementsByDay = new ArrayList<>();
		//days
		listElementsByDay.add(1);
		//elements
		listElementsByDay.add(4);
		//weights
		listElementsByDay.add(30);
		listElementsByDay.add(29);
		listElementsByDay.add(12);
		listElementsByDay.add(1);

		List<Integer> listaDePrueba = new ArrayList<>();
		listaDePrueba.add(30);
		listaDePrueba.add(29);
		listaDePrueba.add(12);
		listaDePrueba.add(1);
		List<Integer> resultado = fileManager.separateList(listElementsByDay);

		Assert.assertEquals(listaDePrueba, resultado);
	}

}