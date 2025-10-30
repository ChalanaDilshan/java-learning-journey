package com.example.counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    int count = 0;

    @FXML
    private Label Label_output;

    @FXML
    private Button btn_reset;

    @FXML
    private Label label2;

    @FXML
    private Button btn_submit;

    @FXML
    private Button sub_btn;

    @FXML
    void OnClick(ActionEvent event) {
        if (count < 10) {
            Label_output.setText("Count : " + count++);
        } else {
            Label_output.setText("Limit Reached!");
        }
        label2.setText("");
    }

    @FXML
    void ResetClick(ActionEvent event) {
        count = 0;
        Label_output.setText("Count : "+count);
        label2.setText("Count Reset Successfully");
    }

    @FXML
    void onMinus(ActionEvent event) {
        if (count > 0) {
            count--;
            Label_output.setText("Count : " + count);
        } else {
            Label_output.setText("Cannot go below 0!");
        }
    }

}
