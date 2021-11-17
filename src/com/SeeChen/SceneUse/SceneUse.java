package com.SeeChen.SceneUse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SceneUse extends Application {
    public static void main(String[]args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Next Scene");
        Button btnBack = new Button("Back");

        button.setLayoutX(200); button.setLayoutY(200);
        btnBack.setLayoutX(200); btnBack.setLayoutY(200);

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(button);
        AnchorPane root2 = new AnchorPane();
        root2.getChildren().addAll(btnBack);

        Scene scene = new Scene(root, 500, 500);
        Scene scene2 = new Scene(root2, 500, 500);

        button.setOnAction(e -> {
            primaryStage.setScene(scene2);
        });
        btnBack.setOnAction(e -> {
            primaryStage.setScene(scene);
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Main Scene");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
