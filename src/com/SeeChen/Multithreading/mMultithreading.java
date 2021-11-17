package com.SeeChen.Multithreading;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import javax.swing.text.html.ImageView;

public class mMultithreading {

    @FXML
    Label lb;
    @FXML
    Label lb1;

    @FXML
    Button btn;

    @FXML
    ImageView img;

    public void btnClick(){
        Thread thread = new Thread(() ->{
            String name = "SeeChen Lee";

            Platform.runLater(() -> {
                lb.setText(name);
                lb1.setText("嘻嘻" + name);
            });
        });
        thread.start();
    }
}
