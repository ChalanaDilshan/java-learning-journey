package com.example.dollartolkrconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button converter_btn;

    @FXML
    private TextField user_input;

    @FXML
    private Label output_lbl;

    @FXML
    void LKRtoUSD(ActionEvent event) {
        //get user input
        String input = user_input.getText();

        //String to int conversion
        int userInput = Integer.parseInt(input);
        double lkrval = userInput * 304.50;

        //int to String conversion
        String output_txt = String.valueOf(lkrval);
        output_lbl.setText("LKR : "+output_txt);
    }

}
