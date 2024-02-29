package com.example.moduloUsuario;


import javafx.scene.control.TextField;

public class UsuarioController {

    public TextField txtNom;
    public TextField txtCognom;
    public TextField txtMultiplicador;

    public TextField getTxtNom() {
        return txtNom;
    }

    public void setTxtNom(TextField txtNom) {
        this.txtNom = txtNom;
    }

    public TextField getTxtCognom() {
        return txtCognom;
    }

    public void setTxtCognom(TextField txtCognom) {
        this.txtCognom = txtCognom;
    }

    public TextField getTxtMultiplicador() {
        return txtMultiplicador;
    }

    public void setTxtMultiplicador(TextField txtMultiplicador) {
        this.txtMultiplicador = txtMultiplicador;
    }

    @Override
    public String toString() {
        return "UsuarioController{" +
                "txtNom=" + txtNom +
                ", txtCognom=" + txtCognom +
                ", txtMultiplicador=" + txtMultiplicador +
                '}';
    }
}
