package com.example.mainpage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class login extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        loginController r2 = new loginController();
        System.out.println(r2.remember);
       if (!r2.remember){
        FXMLLoader fxmlLoader = new FXMLLoader(login.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }else{
           NewsPage news1 = new NewsPage();
           Stage stage1 = new Stage();
           news1.start(stage);
       }
    }

    public static void main(String[] args) {
        launch();
    }
}