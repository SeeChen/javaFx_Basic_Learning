package com.SeeChen.FXML;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class fxmlUse extends Application {
    public static void main(String[]args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = FXMLLoader.load(getClass().getResource("fxmlUse.fxml"));

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
