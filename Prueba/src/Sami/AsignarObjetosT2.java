package Sami;

public class AsignarObjetosT2 {

    public Tabla2 asignarPalabra(Hamming hamming){

        Tabla2 t2 = new Tabla2("", "", "", "", "",
                Integer.toString(hamming.palabraCompleta[2]), Integer.toString(hamming.palabraCompleta[4]),
                Integer.toString(hamming.palabraCompleta[5]), Integer.toString(hamming.palabraCompleta[6]),
                Integer.toString(hamming.palabraCompleta[8]), Integer.toString(hamming.palabraCompleta[9]),
                Integer.toString(hamming.palabraCompleta[10]), Integer.toString(hamming.palabraCompleta[11]),
                Integer.toString(hamming.palabraCompleta[12]), Integer.toString(hamming.palabraCompleta[13]),
                Integer.toString(hamming.palabraCompleta[14]), Integer.toString(hamming.palabraCompleta[16]),
                "Palabra sin paridad", "", "");

        return t2;
    }

    public Tabla2 asignarP1(Hamming hamming1, Hamming hamming2){

        Tabla2 t2 = new Tabla2(Integer.toString(hamming1.bitsParidad.get(0)), "", "", "", "",
                Integer.toString(hamming1.palabraCompleta[2]), Integer.toString(hamming1.palabraCompleta[4]),
                "", Integer.toString(hamming1.palabraCompleta[6]),
                Integer.toString(hamming1.palabraCompleta[8]), "",
                Integer.toString(hamming1.palabraCompleta[10]), "",
                Integer.toString(hamming1.palabraCompleta[12]), "",
                Integer.toString(hamming1.palabraCompleta[14]), Integer.toString(hamming1.palabraCompleta[16]),
                "P1", Integer.toString(hamming1.bitsParidad.get(0)), Integer.toString(hamming2.bitsParidad.get(0)));

        return t2;
    }

    public Tabla2 asignarP2(Hamming hamming1, Hamming hamming2){

        Tabla2 t2 = new Tabla2("", Integer.toString(hamming1.bitsParidad.get(1)), "", "", "",
                Integer.toString(hamming1.palabraCompleta[2]), "",
                Integer.toString(hamming1.palabraCompleta[5]), Integer.toString(hamming1.palabraCompleta[6]),
                "", Integer.toString(hamming1.palabraCompleta[9]),
                Integer.toString(hamming1.palabraCompleta[10]), "",
                "", Integer.toString(hamming1.palabraCompleta[13]),
                Integer.toString(hamming1.palabraCompleta[14]), "",
                "P2", Integer.toString(hamming1.bitsParidad.get(1)),
                Integer.toString(hamming2.bitsParidad.get(1)));

        return t2;
    }

    public Tabla2 asignarP3(Hamming hamming1, Hamming hamming2){

        Tabla2 t2 = new Tabla2("", "", Integer.toString(hamming1.bitsParidad.get(2)), "", "",
                "", Integer.toString(hamming1.palabraCompleta[4]),
                Integer.toString(hamming1.palabraCompleta[5]), Integer.toString(hamming1.palabraCompleta[6]),
                "", "",
                "", Integer.toString(hamming1.palabraCompleta[11]),
                Integer.toString(hamming1.palabraCompleta[12]), Integer.toString(hamming1.palabraCompleta[13]),
                Integer.toString(hamming1.palabraCompleta[14]),"",
                "P3", Integer.toString(hamming1.bitsParidad.get(2)),
                Integer.toString(hamming2.bitsParidad.get(2)));

        return t2;
    }

    public Tabla2 asignarP4(Hamming hamming1, Hamming hamming2){

        Tabla2 t2 = new Tabla2("", "", "", Integer.toString(hamming1.bitsParidad.get(3)), "",
                "", "",
                "", "",
                Integer.toString(hamming1.palabraCompleta[8]), Integer.toString(hamming1.palabraCompleta[9]),
                Integer.toString(hamming1.palabraCompleta[10]), Integer.toString(hamming1.palabraCompleta[11]),
                Integer.toString(hamming1.palabraCompleta[12]), Integer.toString(hamming1.palabraCompleta[13]),
                Integer.toString(hamming1.palabraCompleta[14]), "",
                "P4", Integer.toString(hamming1.bitsParidad.get(3)),
                Integer.toString(hamming2.bitsParidad.get(3)));

        return t2;
    }

    public Tabla2 asignarP5(Hamming hamming1, Hamming hamming2){

        Tabla2 t2 = new Tabla2("", "", "", "", Integer.toString(hamming1.bitsParidad.get(4)),
                "", "",
                "", "",
                "", "",
                "", "",
                "", "",
                "", Integer.toString(hamming1.palabraCompleta[16]),
                "P5", Integer.toString(hamming1.bitsParidad.get(4)),
                Integer.toString(hamming2.bitsParidad.get(4)));

        return t2;
    }

}
