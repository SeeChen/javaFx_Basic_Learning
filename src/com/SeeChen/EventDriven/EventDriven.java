package com.SeeChen.EventDriven;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Dragboard;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EventDriven extends Application {
    public static void main(String[]args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 500, 500);

        Label label = new Label("Hello World");
        label.setLayoutX(200); label.setLayoutY(200);

        Button button = new Button("Click Me");
        button.setLayoutX(300); button.setLayoutY(200);

        TextField text = new TextField();
        text.setLayoutX(10); text.setLayoutY(10);

        // button click event
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setLayoutY(label.getLayoutY() - 5);
            }
        });

        // 键盘触发事件
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                KeyCode keyCode = event.getCode();
                System.out.println("这是 " + keyCode + "按下事件\n");
            }
        });
        scene.setOnKeyReleased(e -> {
            KeyCode keyCode = e.getCode();
            System.out.println("这是 " + keyCode + "抬起事件\n");
        });

        //拖拽事件
        text.setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.ANY);
        });
        text.setOnDragDropped(event -> {
            Dragboard dragboard = event.getDragboard();
            if(dragboard.hasFiles()){
                String path = dragboard.getFiles().get(0).getAbsolutePath();
                text.setText(path);
            }
        });

        root.getChildren().addAll(label, button, text);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Event Driven");
        primaryStage.show();
    }
}
