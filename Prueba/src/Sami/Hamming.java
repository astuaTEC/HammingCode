package Sami;

import java.util.ArrayList;
import java.util.List;

public class Hamming {
    public boolean paridadPar = true;

    public ArrayList<Integer> bitsParidad = new ArrayList<>();
    public int[] palabraCompleta = new int[17];


    public void hamming(String input){

        // se agrega los bits en su posición correspondiente
        palabraCompleta[2] = Character.getNumericValue(input.charAt(0));
        palabraCompleta[4] = Character.getNumericValue(input.charAt(1));
        palabraCompleta[5] = Character.getNumericValue(input.charAt(2));
        palabraCompleta[6] = Character.getNumericValue(input.charAt(3));
        palabraCompleta[8] = Character.getNumericValue(input.charAt(4));
        palabraCompleta[9] = Character.getNumericValue(input.charAt(5));
        palabraCompleta[10] = Character.getNumericValue(input.charAt(6));
        palabraCompleta[11] = Character.getNumericValue(input.charAt(7));
        palabraCompleta[12] = Character.getNumericValue(input.charAt(8));
        palabraCompleta[13] = Character.getNumericValue(input.charAt(9));
        palabraCompleta[14] = Character.getNumericValue(input.charAt(10));
        palabraCompleta[16] = Character.getNumericValue(input.charAt(11));

        // se calcula cada uno de los bits de paridad
        paridad_1();
        paridad_2();
        paridad_3();
        paridad_4();
        paridad_5();
    }


    public void paridad_1(){
        // llamar a la función de calcular paridad par o impar
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(palabraCompleta[2]);
        lista.add(palabraCompleta[4]);
        lista.add(palabraCompleta[6]);
        lista.add(palabraCompleta[8]);
        lista.add(palabraCompleta[10]);
        lista.add(palabraCompleta[12]);
        lista.add(palabraCompleta[14]);
        lista.add(palabraCompleta[16]);

        int resultado;
        if(paridadPar){
            //llama a la funcion par
            resultado = paridadPar(lista);
        }
        else{
            //llama a la función impar
            resultado = paridadImpar(lista);
        }

        bitsParidad.add(resultado);
    }

    public void paridad_2(){
        // llamar a la función de calcular paridad par o impar
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(palabraCompleta[2]);
        lista.add(palabraCompleta[5]);
        lista.add(palabraCompleta[6]);
        lista.add(palabraCompleta[9]);
        lista.add(palabraCompleta[10]);
        lista.add(palabraCompleta[13]);
        lista.add(palabraCompleta[14]);

        int resultado;
        if(paridadPar){
            //llama a la funcion par
            resultado = paridadPar(lista);
        }
        else{
            //llama a la función impar
            resultado = paridadImpar(lista);
        }

        bitsParidad.add(resultado);
    }

    public void paridad_3(){
        // llamar a la función de calcular paridad par o impar
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(palabraCompleta[4]);
        lista.add(palabraCompleta[5]);
        lista.add(palabraCompleta[6]);
        lista.add(palabraCompleta[11]);
        lista.add(palabraCompleta[12]);
        lista.add(palabraCompleta[13]);
        lista.add(palabraCompleta[14]);

        int resultado;
        if(paridadPar){
            //llama a la funcion par
            resultado = paridadPar(lista);
        }
        else{
            //llama a la función impar
            resultado = paridadImpar(lista);
        }

        bitsParidad.add(resultado);
    }

    public void paridad_4(){
        // llamar a la función de calcular paridad par o impar
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(palabraCompleta[8]);
        lista.add(palabraCompleta[9]);
        lista.add(palabraCompleta[10]);
        lista.add(palabraCompleta[11]);
        lista.add(palabraCompleta[12]);
        lista.add(palabraCompleta[13]);
        lista.add(palabraCompleta[14]);

        int resultado;
        if(paridadPar){
            //llama a la funcion par
            resultado = paridadPar(lista);
        }
        else{
            //llama a la función impar
            resultado = paridadImpar(lista);
        }

        bitsParidad.add(resultado);
    }

    public void paridad_5(){
        // llamar a la función de calcular paridad par o impar
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(palabraCompleta[16]);

        int resultado;
        if(paridadPar){
            //llama a la funcion par
            resultado = paridadPar(lista);
        }
        else{
            //llama a la función impar
            resultado = paridadImpar(lista);
        }

        bitsParidad.add(resultado);
    }

    public int paridadPar(ArrayList<Integer> listaEnteros) {
        int cantidadUnos = 0;
        for(int i = 0; i< listaEnteros.size(); i++){
            if (listaEnteros.get(i) == 1) {
                cantidadUnos += 1;
            }
        }
        if (cantidadUnos % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public int paridadImpar(ArrayList<Integer> listaEnteros) {
        int cantidadUnos = 0;
        for(int i = 0; i< listaEnteros.size(); i++){
            if (listaEnteros.get(i) == 1) {
                cantidadUnos += 1;
            }
        }
        if (cantidadUnos % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
