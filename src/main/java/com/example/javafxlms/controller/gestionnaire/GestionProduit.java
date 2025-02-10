package com.example.javafxlms.controller.gestionnaire;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GestionProduit {

    @FXML
    private Button ajouter;

    @FXML
    private TableColumn<?, ?> dangerositeColumn;

    @FXML
    private Spinner<?> dangerositeSpinner;

    @FXML
    private TableColumn<?, ?> dateCreationColumn;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private TableColumn<?, ?> descriptionColumn;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> libelleColumn;

    @FXML
    private TextField libelleField;

    @FXML
    private Button modifier;

    @FXML
    private TableView<?> productTable;

    @FXML
    private TableColumn<?, ?> quantiteColumn;

    @FXML
    private Spinner<?> quantiteSpinner;

    @FXML
    private Button rechercher;

    @FXML
    private TextField searchField;

    @FXML
    private Button supprimer;

    @FXML
    void ajouterProduit(ActionEvent event) {

    }

    @FXML
    void handleSearch(ActionEvent event) {

    }

    @FXML
    void modifProduit(ActionEvent event) {

    }

    @FXML
    void searchField(ActionEvent event) {

    }

    @FXML
    void supprProduit(ActionEvent event) {

    }

}
