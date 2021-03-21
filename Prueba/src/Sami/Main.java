package Sami;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Hamming hamming = new Hamming();
        hamming.hamming("101010101010");

        Hamming hamming2 = new Hamming();
        hamming2.hamming("101010101011");

        Comparador comparador = new Comparador();

        int resultado = comparador.posError(hamming.bitsParidad, hamming2.bitsParidad);

        System.out.println("Error en: "+ resultado);
    }
}
