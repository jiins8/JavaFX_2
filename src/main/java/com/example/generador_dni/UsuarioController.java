package com.example.generador_dni;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UsuarioController {
    @FXML
    public TextField txtNom;
    @FXML
    public TextField txtCognom;
    @FXML
    public TextField txtMultiplicador;

    public TextField getTxtNom() {
        return txtNom;
    }

    public void setTxtNom(String nom) {
        txtNom.setText(nom);
    }

    public TextField getTxtCognom() {
        return txtCognom;
    }

    public void setTxtCognom(String cognom) {
        txtCognom.setText(cognom);
    }
    public TextField getTxtMultiplicador() {
        return txtMultiplicador;
    }

    public void setTxtMultiplicador(String multiplicador) {
        txtMultiplicador.setText(multiplicador);
    }
}
