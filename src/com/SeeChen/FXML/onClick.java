package com.SeeChen.FXML;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class onClick {
    @FXML
    Label label;

    @FXML
    Button btn;

    public void btnClick(){
        label.setLayoutY(label.getLayoutY() + 5);
    }
}
