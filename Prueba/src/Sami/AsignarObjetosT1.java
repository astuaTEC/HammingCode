package Sami;



public class AsignarObjetosT1 {

    public Tabla1 asignarPalabra(Hamming hamming) {

        Tabla1 t1 = new Tabla1("", "", "", "", "",
                Integer.toString(hamming.palabraCompleta[2]), Integer.toString(hamming.palabraCompleta[4]),
                Integer.toString(hamming.palabraCompleta[5]), Integer.toString(hamming.palabraCompleta[6]),
                Integer.toString(hamming.palabraCompleta[8]), Integer.toString(hamming.palabraCompleta[9]),
                Integer.toString(hamming.palabraCompleta[10]), Integer.toString(hamming.palabraCompleta[11]),
                Integer.toString(hamming.palabraCompleta[12]), Integer.toString(hamming.palabraCompleta[13]),
                Integer.toString(hamming.palabraCompleta[14]), Integer.toString(hamming.palabraCompleta[16]),
                "Palabra sin paridad");

        return t1;
    }

    public Tabla1 asignarP1(Hamming hamming) {

        Tabla1 t1 = new Tabla1(Integer.toString(hamming.bitsParidad.get(0)), "", "", "","",
                Integer.toString(hamming.palabraCompleta[2]), Integer.toString(hamming.palabraCompleta[4]),
                "", Integer.toString(hamming.palabraCompleta[6]),
                Integer.toString(hamming.palabraCompleta[8]), "",
                Integer.toString(hamming.palabraCompleta[10]), "",
                Integer.toString(hamming.palabraCompleta[12]), "",
                Integer.toString(hamming.palabraCompleta[14]), Integer.toString(hamming.palabraCompleta[16]),
                "P1");
        return t1;
    }

    public Tabla1 asignarP2(Hamming hamming){

        Tabla1 t1 = new Tabla1("", Integer.toString(hamming.bitsParidad.get(1)), "", "", "",
                Integer.toString(hamming.palabraCompleta[2]), "",
                Integer.toString(hamming.palabraCompleta[5]), Integer.toString(hamming.palabraCompleta[6]),
                "", Integer.toString(hamming.palabraCompleta[9]),
                Integer.toString(hamming.palabraCompleta[10]), "",
                "", Integer.toString(hamming.palabraCompleta[13]),
                Integer.toString(hamming.palabraCompleta[14]), "",
                "P2");

        return t1;
    }

    public Tabla1 asignarP3(Hamming hamming){

        Tabla1 t1 = new Tabla1("", "", Integer.toString(hamming.bitsParidad.get(2)), "", "",
                "", Integer.toString(hamming.palabraCompleta[4]),
                Integer.toString(hamming.palabraCompleta[5]), Integer.toString(hamming.palabraCompleta[6]),
                "", "",
                "", Integer.toString(hamming.palabraCompleta[11]),
                Integer.toString(hamming.palabraCompleta[12]), Integer.toString(hamming.palabraCompleta[13]),
                Integer.toString(hamming.palabraCompleta[14]),"",
                "P3");

        return t1;
    }

    public Tabla1 asignarP4(Hamming hamming){

        Tabla1 t1 = new Tabla1("", "", "", Integer.toString(hamming.bitsParidad.get(3)), "",
                "", "",
               "", "",
                Integer.toString(hamming.palabraCompleta[8]), Integer.toString(hamming.palabraCompleta[9]),
                Integer.toString(hamming.palabraCompleta[10]), Integer.toString(hamming.palabraCompleta[11]),
                Integer.toString(hamming.palabraCompleta[12]), Integer.toString(hamming.palabraCompleta[13]),
                Integer.toString(hamming.palabraCompleta[14]), "",
                "P4");
        return t1;
    }

    public Tabla1 asignarP5(Hamming hamming){

        Tabla1 t1 = new Tabla1("", "", "", "", Integer.toString(hamming.bitsParidad.get(4)),
                "", "",
                "", "",
                "", "",
                "", "",
                "", "",
                "", Integer.toString(hamming.palabraCompleta[16]),
                "P5");

        return t1;
    }

    public Tabla1 asignarPalabraCompleta(Hamming hamming){

        Tabla1 t1 = new Tabla1(Integer.toString(hamming.bitsParidad.get(0)), Integer.toString(hamming.bitsParidad.get(1)),
                Integer.toString(hamming.bitsParidad.get(2)), Integer.toString(hamming.bitsParidad.get(3)),
                Integer.toString(hamming.bitsParidad.get(4)),
                Integer.toString(hamming.palabraCompleta[2]), Integer.toString(hamming.palabraCompleta[4]),
                Integer.toString(hamming.palabraCompleta[5]), Integer.toString(hamming.palabraCompleta[6]),
                Integer.toString(hamming.palabraCompleta[8]), Integer.toString(hamming.palabraCompleta[9]),
                Integer.toString(hamming.palabraCompleta[10]), Integer.toString(hamming.palabraCompleta[11]),
                Integer.toString(hamming.palabraCompleta[12]), Integer.toString(hamming.palabraCompleta[13]),
                Integer.toString(hamming.palabraCompleta[14]), Integer.toString(hamming.palabraCompleta[16]),
                "Palabra con paridad");

        return t1;
    }

}
