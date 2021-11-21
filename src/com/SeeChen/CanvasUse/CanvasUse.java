package com.SeeChen.CanvasUse;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CanvasUse extends Application {
    public static final double WIDTH = 800, HEIGHT = 600;
    private Canvas canvas = new Canvas(WIDTH, HEIGHT);
    private GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
    private double x;
    private double y;

    @Override
    public void start(Stage primaryStage) throws Exception {
        canvas.setLayoutX(0);
        canvas.setLayoutY(0);

        graphicsContext.setStroke(Color.GREEN);
        graphicsContext.setFill(Color.RED);
        graphicsContext.fillRect(30, 30, 50, 50);

        canvas.setOnMousePressed(e -> {
            x = e.getX();
            y = e.getY();
        });
        canvas.setOnMouseDragged(e ->{
            double x1 = e.getX(), y1 = e.getY();

            graphicsContext.strokeLine(x, y, x1, y1);

            x = x1; y = y1;
        });

        AnchorPane root = new AnchorPane(canvas);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args){
        Application.launch(args);
    }
}
