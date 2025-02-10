package com.example.javafxlms.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestionCommandeController {

    @FXML
    private Button ajouter;

    @FXML
    private TableColumn<?, ?> dateCommandeColumn;

    @FXML
    private DatePicker dateCommandePicker;

    @FXML
    private TableColumn<?, ?> etatColumn;

    @FXML
    private ComboBox<?> etatComboBox;

    @FXML
    private TableColumn<?, ?> fournisseurColumn;

    @FXML
    private ComboBox<?> fournisseurComboBox;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private Button modifier;

    @FXML
    private TableView<?> orderTable;

    @FXML
    private TableColumn<?, ?> prixColumn;

    @FXML
    private TextField prixField;

    @FXML
    private TableColumn<?, ?> produitColumn;

    @FXML
    private ComboBox<?> produitComboBox;

    @FXML
    private TableColumn<?, ?> quantiteColumn;

    @FXML
    private TextField quantiteField;

    @FXML
    private TextField searchField;

    @FXML
    private Button supprimer;

    @FXML
    void ajoutCommande(ActionEvent event) {

    }

    @FXML
    void etat(ActionEvent event) {

    }

    @FXML
    void fournisseur(ActionEvent event) {

    }

    @FXML
    void handleSearch(ActionEvent event) {

    }

    @FXML
    void modifCommande(ActionEvent event) {

    }

    @FXML
    void produit(ActionEvent event) {

    }

    @FXML
    void searchField(ActionEvent event) {

    }

    @FXML
    void supprCommande(ActionEvent event) {

    }

}
