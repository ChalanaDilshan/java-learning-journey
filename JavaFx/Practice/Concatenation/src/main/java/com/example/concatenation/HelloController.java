package com.example.concatenation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button Merge_btn;

    @FXML
    private Label Output_lbl;

    @FXML
    private Label lbl_output;

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private TextField tf3;

    @FXML
    void Merge_button(ActionEvent event) {
        Output_lbl.setText(tf1.getText()+" "+tf2.getText()+" "+tf3.getText());
    }

}
