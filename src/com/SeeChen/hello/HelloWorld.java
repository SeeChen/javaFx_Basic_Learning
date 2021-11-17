package com.SeeChen.hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloWorld extends Application{
    public static void main(String[]args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hello World!");
        BorderPane pane = new BorderPane(label);

        Scene scene = new Scene(pane, 300, 300);

        primaryStage.setScene(scene);
        // settings stage title
        primaryStage.setTitle("This is Title");
        // show the stage
        primaryStage.show();
    }
}