package com.example.demo2;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements EventHandler  {
    private Button rotateButton;
    private Button blurButton;
    private Button scaleButton;
    private Label outputLabel;
    private Rotate rotate;

    private double Angle = 0;


    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Java Application");

        rotateButton = new Button("Rotate");
        blurButton = new Button("Blur");
        scaleButton = new Button("Scale");
        outputLabel = new Label("Something");
        rotate = new Rotate();

        rotateButton.getTransforms().add(rotate);

        rotateButton.setOnAction(this);
        blurButton.setOnAction(this);
        scaleButton.setOnAction(this);


        FlowPane root = new FlowPane(10,10);
        root.getChildren().addAll(rotateButton,blurButton,scaleButton,outputLabel);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root,640,480);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(Event event){
        if(event.getSource().equals(rotateButton)){
            Angle += 45;
            rotate.setAngle(Angle);
            rotate.setPivotX(rotateButton.getHeight()/2);
            rotate.setPivotY(rotateButton.getWidth()/2);
            System.out.println("Rotated by "+Angle+" degrees.");
        }

        if(event.getSource().equals(blurButton)){
            System.out.println("Clicked blur button");
            outputLabel.setText("Hi welcome!");
        }

        if(event.getSource().equals(scaleButton)){
            System.out.println("Clicked scale button");
        }
    }


}
