package com.SeeChen.Controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;

public class control {

    @FXML
    private Circle cir;

    public void cirBind(Scene scene){
        cir.centerXProperty().bind(scene.widthProperty().divide(2));
        cir.centerYProperty().bind(scene.heightProperty().divide(2));
    }
}
