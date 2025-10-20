package Practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn = new Button("Click me");
        btn.setOnAction(e -> {
            System.out.println("Hello world");
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root,500,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Practice 1");
        primaryStage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }

}
