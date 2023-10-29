package com.example.mainpage;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class signUpController {

    @FXML
    private TextField userMail;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField userPassword;

    @FXML
    void LoginSU(MouseEvent event) {

    }

    @FXML
    void femaleBox(ActionEvent event) {

    }

    @FXML
    void maleBox(ActionEvent event) {

    }

    @FXML
    void otherBox(ActionEvent event) {

    }

    @FXML
    void signUpSU(MouseEvent event) throws Exception {
        boolean mailEmpty=false, passwordEmpty = false, nameEmpty=false, notSame = false, notMatching = false;
        dataAnalize add = new dataAnalize(userName.getText(), userPassword.getText(), userMail.getText());
        createFolder folder = new createFolder(userName.getText());
        folder.addFile();
        add.save();
        Alert errorAlert = new Alert(AlertType.ERROR);

        if (userName.getText().length() != 0) {
            userName.setStyle("-fx-text-box-border: #00FF00; -fx-focus-color: #00FF00;");
            if (userPassword.getText().length() == 0) {
                userPassword.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                passwordEmpty = true;
            } else {
                userPassword.setStyle("-fx-text-box-border: #00FF00; -fx-focus-color: #00FF00;");
                passwordEmpty = false;
            }
            if (userMail.getText().length() == 0) {
                userMail.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                mailEmpty = true;
            } else {
                userMail.setStyle("-fx-text-box-border: #00FF00; -fx-focus-color: #00FF00;");
                mailEmpty = false;
            }
            if (add.matchingTest()) {
                notMatching = true;
                userName.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                userPassword.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                userMail.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                errorAlert.setHeaderText("Name/Password already taken.\nChange it!");
                errorAlert.showAndWait();
            } else if (userName.getText().equals(userPassword.getText())) {
                userName.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                userPassword.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                userMail.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                notSame = true;
                errorAlert.setHeaderText("Name and Password are same.\nChange it!");
                errorAlert.showAndWait();
            } else {
                notMatching = false;
                notSame = false;
                System.out.println("good");
            }
        }else{
            userName.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
             nameEmpty= true;
            userMail.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            mailEmpty = true;
            userPassword.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            passwordEmpty = true;
        }
        if (!notMatching && !notSame && !nameEmpty && !mailEmpty && !passwordEmpty) {
            add.saveToMain();
            login lg = new login();
            Stage stage = new Stage();
            lg.start(stage);


        }
    }

    void endSes(){
        Platform.exit();
    }
}