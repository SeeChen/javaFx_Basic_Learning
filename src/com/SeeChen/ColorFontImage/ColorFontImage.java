package com.SeeChen.ColorFontImage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ColorFontImage extends Application {
    public static void main(String[]args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();
        circle.setLayoutX(200); circle.setLayoutY(200);
        circle.setRadius(50);
        // Color
        circle.setFill(Color.web("#1aa260"));
        circle.setStrokeWidth(10);
        circle.setStroke(Color.BLUE);

        // font
        Label label = new Label("Hello World, 你好世界！");
        label.setLayoutX(10); label.setLayoutY(10);
        label.setFont(Font.font("KaiTi", FontWeight.BOLD, 30));

        // image
        ImageView imageView = new ImageView();
        Image image = new Image("https://avatars.githubusercontent.com/u/39422761?v=4");
        imageView.setImage(image);
        imageView.setLayoutX(300); imageView.setLayoutY(300);
        imageView.setFitHeight(100); imageView.setFitWidth(100);

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(circle, label, imageView);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
