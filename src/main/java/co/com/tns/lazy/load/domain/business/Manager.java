package co.com.tns.lazy.load.domain.business;

import co.com.tns.lazy.load.domain.Day;

import java.util.*;

/**
 * Transformar archivo a listas
 * Validar datos
 */
public class Manager {


    public int[] separateList(int[] list    ) {
        //   List<Integer> list = new ArrayList<>();

        int[] listSeparate=list;

        int days = list[0];
        int elements;
        int posicion=0;
        for (int i = 0; i < days; i++) {

            elements = list[i + posicion+1];

            for ( int j=0;j <elements; j++) {
                     listSeparate[j] = list[j + 2];
                       posicion=j;

            }
            return  listSeparate;
        }

return listSeparate;

    }
}




