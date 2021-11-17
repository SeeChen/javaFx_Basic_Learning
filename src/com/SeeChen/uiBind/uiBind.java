package com.SeeChen.uiBind;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class uiBind extends Application {
    public static void main(String[]args){
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();
        circle.setCenterX(250); circle.setCenterY(250);
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(circle);

        Scene scene = new Scene(root, 500, 500);

        // 绑定控件
        circle.centerXProperty().bind(scene.widthProperty().divide(2));
        circle.centerYProperty().bind(scene.heightProperty().divide(2));

        // 设置监听
        circle.centerYProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("changed" + oldValue + "now " + newValue);
            }
        });

        primaryStage.setTitle("UI Bind");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
