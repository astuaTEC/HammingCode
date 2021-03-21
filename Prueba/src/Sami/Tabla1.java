package Sami;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Tabla1 {
    public SimpleStringProperty p1, p2, p3, p4, p5;


    public SimpleStringProperty d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12;

    public SimpleStringProperty nombre;

    public String getP1() {
        return p1.get();
    }

    public SimpleStringProperty p1Property() {
        return p1;
    }

    public String getP2() {
        return p2.get();
    }

    public SimpleStringProperty p2Property() {
        return p2;
    }

    public String getP3() {
        return p3.get();
    }

    public SimpleStringProperty p3Property() {
        return p3;
    }

    public String getP4() {
        return p4.get();
    }

    public SimpleStringProperty p4Property() {
        return p4;
    }

    public String getP5() {
        return p5.get();
    }

    public SimpleStringProperty p5Property() {
        return p5;
    }

    public String getD1() {
        return d1.get();
    }

    public SimpleStringProperty d1Property() {
        return d1;
    }

    public String getD2() {
        return d2.get();
    }

    public SimpleStringProperty d2Property() {
        return d2;
    }

    public String getD3() {
        return d3.get();
    }

    public SimpleStringProperty d3Property() {
        return d3;
    }

    public String getD4() {
        return d4.get();
    }

    public SimpleStringProperty d4Property() {
        return d4;
    }

    public String getD5() {
        return d5.get();
    }

    public SimpleStringProperty d5Property() {
        return d5;
    }

    public String getD6() {
        return d6.get();
    }

    public SimpleStringProperty d6Property() {
        return d6;
    }

    public String getD7() {
        return d7.get();
    }

    public SimpleStringProperty d7Property() {
        return d7;
    }

    public String getD8() {
        return d8.get();
    }

    public SimpleStringProperty d8Property() {
        return d8;
    }

    public String getD9() {
        return d9.get();
    }

    public SimpleStringProperty d9Property() {
        return d9;
    }

    public String getD10() {
        return d10.get();
    }

    public SimpleStringProperty d10Property() {
        return d10;
    }

    public String getD11() {
        return d11.get();
    }

    public SimpleStringProperty d11Property() {
        return d11;
    }

    public String getD12() {
        return d12.get();
    }

    public SimpleStringProperty d12Property() {
        return d12;
    }

    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public Tabla1(String p1, String p2, String p3, String p4, String p5, String d1,
                  String d2, String d3, String d4, String d5, String d6, String d7,
                  String d8, String d9, String d10, String d11, String d12, String nombre) {
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
    }


    public Tabla1(){

    }


}
