package com.SeeChen.StageUse;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageUse extends Application{
    public static void main(String[]args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 设置 title
        primaryStage.setTitle("This is Title");

        // 设置 icon
        primaryStage.getIcons().add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/How_to_use_icon.svg/1200px-How_to_use_icon.svg.png"));

        // 设置无法控制大小
        primaryStage.setResizable(false);

        // 设置窗口样式
        primaryStage.initStyle(StageStyle.UNDECORATED);

        Button button = new Button("Open New Window");
        button.setLayoutX(200); button.setLayoutY(200);

        Button btnExit = new Button("Exit");
        btnExit.setLayoutX(200); btnExit.setLayoutY(300);

        AnchorPane pane = new AnchorPane();
        pane.getChildren().addAll(button, btnExit);

        button.setOnAction(event -> {
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setHeight(200); stage.setWidth(300);
            stage.initOwner(primaryStage);

            // 设置 Modality
            stage.initModality(Modality.WINDOW_MODAL);
            stage.show();
        });

        btnExit.setOnAction(event -> {
            Platform.exit();
        });

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
