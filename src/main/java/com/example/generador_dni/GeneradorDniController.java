package com.example.generador_dni;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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

    }

    @FXML
    private void onClickDeleteBtn(){
        dni.setText("");
        usuarioController.setTxtNom("");
        usuarioController.setTxtCognom("");
        usuarioController.setTxtMultiplicador("");
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}