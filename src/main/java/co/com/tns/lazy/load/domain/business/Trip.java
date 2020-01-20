package co.com.tns.lazy.load.domain.business;

import java.awt.List;

/**
 * Para las operaciones de organizar listas y algoritmo de calcular viajes
 */
public class Trip {
	
	
	
	
	public int retornarNumeroDeViajes(int[] lista) {
		int incrementable =0;
		int cantidadElemetosDisponibles= lista.length;		
		for (int i = 0; i < lista.length; i++) {
			if(cantidadElemetosDisponibles==0) {
				return incrementable;
			}
			else {
				if(lista[i]>=50) {
					incrementable+=1;
					cantidadElemetosDisponibles--;
				}
				else {
					int aumento=2;
					int pesoBolsa=0;
					while(pesoBolsa<50 &&cantidadElemetosDisponibles>0) {
						pesoBolsa=lista[i]*aumento;
						aumento++;
						cantidadElemetosDisponibles-=2;
						
					}
					incrementable++;
				}
				
			}
			
			
		}
		return incrementable;
		
		
		
	}
	
}
