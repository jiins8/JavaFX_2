package com.example.generador_dni;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class DniGeneratorController implements Initializable {

    @FXML
    private userController userController;
    @FXML
    private TextField dni, txtName, txtSurname, txtMultiplier;
    @FXML
    private Button dniBtn, deleteBtn;
    @FXML
    private Text toastMsg;


    @FXML
    private void onClickDniBtn() {
        String name = userController.getTxtName().getText();
        String surname = userController.getTxtSurname().getText();

        String letters = getFirstLetters(name, surname);

        if (letters.length() < 7) {
            toastMsg.setText("Name and surname must have at least 7 letters");
            toastMsg.setFill(Color.RED);
            return;
        } else {
            toastMsg.setText("");
            toastMsg.setFill(Color.GREEN);
        }

        String dniGenerated = generateDni(letters);

        String checkMultiplier = userController.getTxtMultiplier().getText();
        if (checkMultiplier.isBlank()) {
            toastMsg.setText("Multiplier cannot be null");
            toastMsg.setFill(Color.RED);
            return;
        } else if (!checkMultiplier.matches("[1-9]")) {
            toastMsg.setText("Multiplier must be between 1 and 9");
            toastMsg.setFill(Color.RED);
            return;
        }

        int multiplier = Integer.parseInt(userController.getTxtMultiplier().getText());

        int result = Integer.parseInt(dniGenerated) * multiplier;

        char dniLetter = getDniLetter(result);

        String formattedDni = (String.valueOf(result).length() == 7) ? "0" + result : String.valueOf(result);

        dni.setText(formattedDni + dniLetter);
    }

    @FXML
    private void onClickDeleteBtn() {
        dni.setText("");
        userController.setTxtName("");
        userController.setTxtSurname("");
        userController.setTxtMultiplier("");
    }

    private String getFirstLetters(String name, String surname) {
        String letters;

        if (name.length() >= 7) {
            letters = name.substring(0, 7);
        } else {
            int missingLetters = 7 - name.length();
            letters = name + surname.substring(0, Math.min(surname.length(), missingLetters));
        }

        return letters.toUpperCase();
    }


    private String generateDni(String letters) {
        Map<Character, Integer> abcd = new HashMap<>();

        String abecedari = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < abecedari.length(); i++) {
            abcd.put(abecedari.charAt(i), i + 1);
        }

        StringBuilder dniGenerated = new StringBuilder();
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            int position = abcd.get(letter);
            int num = position % 10;
            dniGenerated.append(num);
        }

        return dniGenerated.toString();
    }

    private char getDniLetter(int numDni) {
        char[] lettersDni = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
        int resto = numDni % 23;
        return lettersDni[resto];
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}