package co.com.tns.lazy.load.domain.business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/**
 * Transformar archivo a listas Validar datos
 */
public class Manager {
	
	File lista = new File("archivo.txt");
	  
	
	

	public boolean validarTipoDeDato(File lista) throws Exception {
		

		String cadena;
		FileReader f = new FileReader(lista);
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			try {
				Integer.parseInt(cadena);
			} catch (Exception e) {
				throw new Exception();
			}
		}
		b.close();
		return true;
	}

}
