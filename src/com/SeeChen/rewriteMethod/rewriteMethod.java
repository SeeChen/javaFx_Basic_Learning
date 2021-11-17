package com.SeeChen.rewriteMethod;

import javafx.application.Application;
import javafx.stage.Stage;

public class rewriteMethod extends Application{
    public static void main(String[]args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Start()");
        primaryStage.setTitle("Rewrite Method");
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        // 程序开始时的方法
        super.init();
        System.out.println("init()");
    }

    @Override
    public void stop() throws Exception {
        // 程序结束时的方法
        super.stop();
        System.out.println("Stop()");
    }
}