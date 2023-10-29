package com.example.mainpage;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class passUpdateController {

    @FXML
    private TextField newPass;

    @FXML
    private TextField oldPass1;

    @FXML
    void updateBut(MouseEvent event) throws IOException {
     UpdateP up = new UpdateP();
     up.changePassword(oldPass1.getText(), newPass.getText());
    }

}
