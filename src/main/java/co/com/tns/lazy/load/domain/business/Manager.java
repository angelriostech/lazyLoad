package co.com.tns.lazy.load.domain.business;

import co.com.tns.lazy.load.domain.Day;

import java.util.*;

/**
 * Transformar archivo a listas
 * Validar datos
 */
public class Manager {


    public int[][] separateList(int[] list) {
        //   List<Integer> list = new ArrayList<>();
        int days = list[0];


        int[][] listOe = new int[days][days];

        int elements=0;
        int position=0;
        for (int i = 0; i < days; i++) {
            int[] listSeparate= new int[100];
            if(i>0){
                position++;
                elements = list[position+1];
            }
            else if(i==0) {
                elements = list[1];
            }

            for ( int j=0;j <elements; j++) {

                 listSeparate[j] = list[position + 2];
                       position++;

            }
            listOe[i] = listSeparate;

        }
        return listOe;


    }
}




