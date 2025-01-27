package com.example.javafxlms;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button inscription;

    @FXML
    private Button login;

    @FXML
    private Button oublieMdp;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField userTextField;

    @FXML
    void OnClickInscription(ActionEvent event) {
        HelloApplication.changeScene("register","inscription");

    }

    @FXML
    void OnClickLogin(ActionEvent event) {

    }

    @FXML
    void OnClickOublieMdp(ActionEvent event) {

    }

}
