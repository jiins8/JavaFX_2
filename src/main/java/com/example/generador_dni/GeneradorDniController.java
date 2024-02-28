package com.example.generador_dni;

import com.example.moduloUsuario.UsuarioController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class GeneradorDniController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private UsuarioController usuarioController;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}