package sample;

import Sami.AsignarObjetosT1;
import Sami.Hamming;
import Sami.Tabla1;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;



public class HammingPar {

    public Button errorPar;
    public Button generateHamming;
    public TableView table1;
    public TableColumn<Tabla1, String> name;
    public TableColumn<Tabla1, Integer> p1;
    public TableColumn<Tabla1, Integer> p2;
    public TableColumn<Tabla1, Integer> d1;
    public TableColumn<Tabla1, Integer> p3;
    public TableColumn<Tabla1, Integer> d2;
    public TableColumn<Tabla1, Integer> d3;
    public TableColumn<Tabla1, Integer> d4;
    public TableColumn<Tabla1, Integer> p4;
    public TableColumn<Tabla1, Integer> d5;
    public TableColumn<Tabla1, Integer> d6;
    public TableColumn<Tabla1, Integer> d7;
    public TableColumn<Tabla1, Integer> d8;
    public TableColumn<Tabla1, Integer> d9;
    public TableColumn<Tabla1, Integer> d10;
    public TableColumn<Tabla1, Integer> d11;
    public TableColumn<Tabla1, Integer> p5;
    public TableColumn<Tabla1, Integer> d12;


    public void createHam(ActionEvent actionEvent) {
        // Se crea el Hamming
        Hamming hamming = new Hamming();
        hamming.hamming("101010101010");

        AsignarObjetosT1 asignarObjetosT1 = new AsignarObjetosT1();

        //Se crea una observable list
        ObservableList<Tabla1> objetosT1s = FXCollections.observableArrayList();

        // Se le agregan elementos a esa lista
        objetosT1s.add(asignarObjetosT1.asignarPalabra(hamming));
        objetosT1s.add(asignarObjetosT1.asignarP1(hamming));
        objetosT1s.add(asignarObjetosT1.asignarP2(hamming));
        objetosT1s.add(asignarObjetosT1.asignarP3(hamming));
        objetosT1s.add(asignarObjetosT1.asignarP4(hamming));
        objetosT1s.add(asignarObjetosT1.asignarP5(hamming));
        objetosT1s.add(asignarObjetosT1.asignarPalabraCompleta(hamming));

        //Se asignan las propiedades correspondientes a cada columna
        name.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        d1.setCellValueFactory(new PropertyValueFactory<>("d1"));
        d2.setCellValueFactory(new PropertyValueFactory<>("d2"));
        d3.setCellValueFactory(new PropertyValueFactory<>("d3"));
        d4.setCellValueFactory(new PropertyValueFactory<>("d4"));
        d5.setCellValueFactory(new PropertyValueFactory<>("d5"));
        d6.setCellValueFactory(new PropertyValueFactory<>("d6"));
        d7.setCellValueFactory(new PropertyValueFactory<>("d7"));
        d8.setCellValueFactory(new PropertyValueFactory<>("d8"));
        d9.setCellValueFactory(new PropertyValueFactory<>("d9"));
        d10.setCellValueFactory(new PropertyValueFactory<>("d10"));
        d11.setCellValueFactory(new PropertyValueFactory<>("d11"));
        d12.setCellValueFactory(new PropertyValueFactory<>("d12"));
        p1.setCellValueFactory(new PropertyValueFactory<>("p1"));
        p2.setCellValueFactory(new PropertyValueFactory<>("p2"));
        p3.setCellValueFactory(new PropertyValueFactory<>("p3"));
        p4.setCellValueFactory(new PropertyValueFactory<>("p4"));
        p5.setCellValueFactory(new PropertyValueFactory<>("p5"));

        // Se llena la tabla
        table1.setItems(objetosT1s);

    }

    public void errorPar(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ErrorPar.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
