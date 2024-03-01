package com.example.generador_dni;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class userController {
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtSurname;
    @FXML
    public TextField txtMultiplier;

    public TextField getTxtName() {
        return txtName;
    }

    public void setTxtName(String name) {
        txtName.setText(name);
    }

    public TextField getTxtSurname() {
        return txtSurname;
    }

    public void setTxtSurname(String surname) {
        txtSurname.setText(surname);
    }
    public TextField getTxtMultiplier() {
        return txtMultiplier;
    }

    public void setTxtMultiplier(String multiplier) {
        txtMultiplier.setText(multiplier);
    }
}
