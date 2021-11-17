package com.SeeChen.NodeUse;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class NodeUse extends Application {
    public static void main(String[]args){
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hello World!");
        label.setLayoutX(200);label.setLayoutY(200);
        label.setStyle("-fx-background-color: red; -fx-border-color: blue; -fx-border-width: 3px");
        label.setPrefHeight(200); label.setPrefWidth(200);
        label.setAlignment(Pos.CENTER);
        label.setOpacity(0.5);
        label.setRotate(45);

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(label);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Node Use");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
