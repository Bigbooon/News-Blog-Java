package com.example.mainpage;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {
    boolean remember;
    @FXML
    private CheckBox rememberMe;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField userPassword;

    @FXML
    void login(MouseEvent event) throws IOException {
        NewsPage news = new NewsPage();
        Stage stage = new Stage();
        loginCheck check = new loginCheck();
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);

        if (check.checkLogin(userName.getText(), userPassword.getText())) {
            System.out.println("Exists, Nexxt");
            if (rememberMe.isSelected()) {
                System.out.println("Check Box");
                this.remember = true;
                news.start(stage);
            } else {
                this.remember = false;
                news.start(stage);
            }
            System.out.println(remember);
        } else {
            System.out.println("nned to register");

            errorAlert.setHeaderText("User Name and Password is not corect.");
            errorAlert.showAndWait();
        }
    }

    @FXML
    void signUp(MouseEvent event) throws IOException {

      SignUp signUp = new SignUp();
      Stage stage = new Stage();
      signUp.start(stage);

    }

    @FXML
    void forgetP(MouseEvent event) throws IOException {
        passUpdate upp = new passUpdate();
        Stage stage = new Stage();
        upp.start(stage);
    }
}