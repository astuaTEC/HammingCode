package Sami;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Tabla2 {

    public SimpleStringProperty pruebaParidad, bitParidad, comprobacion;

    public SimpleStringProperty p1, p2, p3, p4, p5;

    public SimpleStringProperty d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12;

    public SimpleStringProperty nombre;



    public Tabla2(String p1, String p2, String p3, String p4, String p5, String d1,
                  String d2, String d3, String d4, String d5, String d6, String d7,
                  String d8, String d9, String d10, String d11, String d12, String nombre,
                  String pruebaParidad, String bitParidad) {
        this.p1 = new SimpleStringProperty(p1);
        this.p2 = new SimpleStringProperty(p2);
        this.p3 = new SimpleStringProperty(p3);
        this.p4 = new SimpleStringProperty(p4);
        this.p5 = new SimpleStringProperty(p5);
        this.d1 = new SimpleStringProperty(d1);
        this.d2 = new SimpleStringProperty(d2);
        this.d3 = new SimpleStringProperty(d3);
        this.d4 = new SimpleStringProperty(d4);
        this.d5 = new SimpleStringProperty(d5);
        this.d6 = new SimpleStringProperty(d6);
        this.d7 = new SimpleStringProperty(d7);
        this.d8 = new SimpleStringProperty(d8);
        this.d9 = new SimpleStringProperty(d9);
        this.d10 = new SimpleStringProperty(d10);
        this.d11 = new SimpleStringProperty(d11);
        this.d12 = new SimpleStringProperty(d12);
        this.nombre = new SimpleStringProperty(nombre);
        this.pruebaParidad = new SimpleStringProperty(pruebaParidad);
        this.bitParidad = new SimpleStringProperty(bitParidad);

        if(bitParidad.equals(pruebaParidad) && !bitParidad.equals("")) {
            this.comprobacion = new SimpleStringProperty("0");
        }
        else if(!bitParidad.equals(pruebaParidad) && !bitParidad.equals("")) {
            this.comprobacion = new SimpleStringProperty("1");
        }
        else
            this.comprobacion = new SimpleStringProperty("");
    }

    public Tabla2(){

    }
}
