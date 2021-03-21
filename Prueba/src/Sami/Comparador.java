package Sami;

import java.util.ArrayList;
import java.util.Collections;

public class Comparador {


    public int posError(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> listaAux = new ArrayList<Integer>();

        for(int i = 0; i<lista1.size(); i++){
            if(lista1.get(i).equals(lista2.get(i))){
                listaAux.add(0);
            }
            else {
                listaAux.add(1);
            }
        }
        Collections.reverse(listaAux);
        int numeroBinario = 0;

        // se concatena los bits
        for(int i = 0; i<listaAux.size(); i++){
            numeroBinario += (listaAux.get(i) * Math.pow(10, (listaAux.size())-i-1));
        }

        return getDecimal(numeroBinario);
    }


    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

}
