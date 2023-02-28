package com.example.figurasgui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //CUADRADO
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactoryCuadrado =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100);
        valueFactoryCuadrado.setValue(1);
        txt_cuadrado.setValueFactory(valueFactoryCuadrado);
        valor_txt_cuadrado = txt_cuadrado.getValue();
        txt_cuadrado.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                valor_txt_cuadrado = txt_cuadrado.getValue();
            }
        });
        //FIN CUADRADO

        //RECTANGULO
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactoryRectanguloBase =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100);
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactoryRectanguloAltura =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100);

        valueFactoryRectanguloBase.setValue(1);
        valueFactoryRectanguloAltura.setValue(1);
        txt_rect_base.setValueFactory(valueFactoryRectanguloBase);
        txt_rect_altura.setValueFactory(valueFactoryRectanguloAltura);
        valor_txt_rectangulo_base = txt_rect_base.getValue();
        valor_txt_rectangulo_altura = txt_rect_altura.getValue();
        txt_rect_base.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                valor_txt_rectangulo_base = txt_rect_base.getValue();
            }
        });

        txt_rect_altura.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                valor_txt_rectangulo_altura = txt_rect_altura.getValue();
            }
        });
        //FIN RECTANGULO

        //CIRCULO
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactoryCirculo =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100);
        valueFactoryCirculo.setValue(1);
        txt_circ_radio.setValueFactory(valueFactoryCirculo);
        valor_txt_circulo = txt_circ_radio.getValue();
        txt_circ_radio.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                valor_txt_circulo = txt_circ_radio.getValue();
            }
        });
        //FIN CIRCULO



    }

    //CUADRADO
    @FXML
    private Spinner<Integer> txt_cuadrado;
    @FXML
    private Label lb_cuadrado_area;
    @FXML
    private Label lb_cuadrado_perimetro;
    private float valor_txt_cuadrado;

    public void cuadrado(){
        Cuadrado cuadrado = new Cuadrado(valor_txt_cuadrado);
        lb_cuadrado_area.setText("Area: " + cuadrado.area());
        lb_cuadrado_perimetro.setText("Perímetro: " + cuadrado.perimetro());
    }
    // FIN CUADRADO

    //RECTANGULO
    @FXML
    private Spinner<Integer> txt_rect_base;
    @FXML
    private Spinner<Integer> txt_rect_altura;
    @FXML
    private Label lb_rectangulo_area;
    @FXML
    private Label lb_rectangulo_perimetro;
    private float valor_txt_rectangulo_base;
    private float valor_txt_rectangulo_altura;

    public void rectangulo(){
        Rectangulo rectangulo = new Rectangulo(valor_txt_rectangulo_base,valor_txt_rectangulo_altura);
        lb_rectangulo_area.setText("Area: " + rectangulo.area());
        lb_rectangulo_perimetro.setText("Perímetro: " + rectangulo.perimetro());
    }
    // FIN RECTANGULO

    //CIRCULO
    @FXML
    private Spinner<Integer> txt_circ_radio;
    @FXML
    private Label lb_circulo_area;
    @FXML
    private Label lb_circulo_perimetro;
    private float valor_txt_circulo;

    public void circulo(){
        Circulo circulo = new Circulo(valor_txt_circulo);
        lb_circulo_area.setText("Area: " + circulo.area());
        lb_circulo_perimetro.setText("Perímetro: " + circulo.perimetro());
    }
    // FIN CIRCULO





}
