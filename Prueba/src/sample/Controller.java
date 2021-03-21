package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    public TextField entrada;
    public Button botonConver;
    public LineChart<String, Number> NRZI;
    public Button botonNRZI;
    public Button botonParidadPar;
    public Button botonParidadImpar;
    public CategoryAxis x;
    public NumberAxis y;
    public String input;
    public TextField resultOcta;
    public TextField resultDeci;
    public TextField resultHexa;

    //Funciones nueva ventana
    public void paridadPar(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HammingPar.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void paridadImpar(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HammingPar.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    //Fin nueva ventana

    //Ploteo
    public void nrziPlot(ActionEvent actionEvent){
        XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
        series.getData().add(new XYChart.Data<String, Number>("0", 0));
        series.getData().add(new XYChart.Data<String, Number>("1", 0));
        series.getData().add(new XYChart.Data<String, Number>("1", 1));
        NRZI.getData().add(series);
    }

    //Conversión
    public void getInput(ActionEvent actionEvent){
        input = entrada.getText();
        System.out.println(input);
    }

    public void converse(ActionEvent actionEvent) {
        input = entrada.getText();
        Binary value = new Binary(input);
        value.conversion();
        resultOcta.setText(String.valueOf(value.octal));
        resultDeci.setText(String.valueOf(value.getDecimal()));
        resultHexa.setText(value.getHexadecimal());
        //System.out.printf(value.hexadecimal);

    }
}

