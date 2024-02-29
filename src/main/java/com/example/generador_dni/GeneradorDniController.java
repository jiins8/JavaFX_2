package com.example.generador_dni;

import com.example.moduloUsuario.UsuarioController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GeneradorDniController implements Initializable {

    @FXML
    private UsuarioController usuarioController;
    @FXML
    private TextField dni, txtNom, txtCognom, txtMultiplicador;
    @FXML
    private Button dniBtn, deleteBtn;


    @FXML
    private void onClickDniBtn() {
        String nombre = String.valueOf(txtNom);
        String apellido = String.valueOf(txtCognom);

        dni.setText(nombre + " " + apellido);
    }

    @FXML
    private void onClickDeleteBtn(){
        String vacio = "";

        dni.setText(vacio);
        txtNom.setText(vacio);
        txtCognom.setText(vacio);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}