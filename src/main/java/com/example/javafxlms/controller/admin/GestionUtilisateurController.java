package com.example.javafxlms.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestionUtilisateurController {

    @FXML
    private Button ajouter;

    @FXML
    private TableColumn<?, ?> emailColumn;

    @FXML
    private TextField emailField;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private PasswordField mdpField;

    @FXML
    private Button modifier;

    @FXML
    private TableColumn<?, ?> nomColumn;

    @FXML
    private TextField nomField;

    @FXML
    private TableColumn<?, ?> numSecuColumn;

    @FXML
    private TextField numSecuField;

    @FXML
    private TableColumn<?, ?> prenomColumn;

    @FXML
    private TextField prenomField;

    @FXML
    private Button rechercher;

    @FXML
    private TableColumn<?, ?> roleColumn;

    @FXML
    private ComboBox<?> roleComboBox;

    @FXML
    private TextField searchField;

    @FXML
    private Button supprimer;

    @FXML
    private TableView<?> userTable;

    @FXML
    void handleAddUser(ActionEvent event) {

    }

    @FXML
    void handleModifUser(ActionEvent event) {

    }

    @FXML
    void handleSearch(ActionEvent event) {

    }

    @FXML
    void handleSupprUser(ActionEvent event) {

    }

    @FXML
    void roles(ActionEvent event) {

    }

    @FXML
    void searchField(ActionEvent event) {

    }

}
