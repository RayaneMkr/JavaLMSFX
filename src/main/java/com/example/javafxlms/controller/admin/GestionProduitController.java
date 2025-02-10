package com.example.javafxlms.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GestionProduitController {

    @FXML
    private Button ajouter;

    @FXML
    private TableColumn<?, ?> createdByColumn;

    @FXML
    private TableColumn<?, ?> dangerositeColumn;

    @FXML
    private Spinner<?> dangerositeSpinner;

    @FXML
    private TableColumn<?, ?> dateCreationColumn;

    @FXML
    private DatePicker dateCreationPicker;

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
    private Button rechercher;

    @FXML
    private TextField searchField;

    @FXML
    private Button supprimer;

    @FXML
    private ComboBox<?> userComboBox;

    @FXML
    void creerPar(ActionEvent event) {

    }

    @FXML
    void dateProduit(ActionEvent event) {

    }

    @FXML
    void handleAddProduct(ActionEvent event) {

    }

    @FXML
    void handleDeleteProduct(ActionEvent event) {

    }

    @FXML
    void handleEditProduct(ActionEvent event) {

    }

    @FXML
    void handleSearch(ActionEvent event) {

    }

}
