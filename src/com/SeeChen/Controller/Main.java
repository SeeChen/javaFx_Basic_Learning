package com.SeeChen.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[]args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Controller.fxml"));

        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        control controller = fxmlLoader.getController();
        controller.cirBind(scene);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
