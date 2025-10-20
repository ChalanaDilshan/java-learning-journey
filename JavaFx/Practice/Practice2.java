package Practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practice2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{ //throws Exception means "If something break it pass it back to java
        Button btn = new Button("Click me");             //If JavaFX can’t fix it, your app will crashes.
        Button exit = new Button("Exit");                   //We use this part for simple demos,simple codes for real apps we use try catch.

        exit.setOnAction(e ->{
            System.out.println("Exit this app");
            System.exit(0);
        });

        btn.setOnAction(e ->{
            System.out.println("Hello World!");
        });


        VBox root = new VBox();
        root.getChildren().addAll(btn,exit);
        Scene scene = new Scene(root,500,300);
        primaryStage.setTitle("Practice 02");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
