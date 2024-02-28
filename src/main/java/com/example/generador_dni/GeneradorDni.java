package com.example.generador_dni;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GeneradorDni extends Application {
    @Override
    public void start(Stage stage){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(GeneradorDni.class.getResource("generador_dni.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
    }

    }

    public static void main(String[] args) {
        launch();
    }
}