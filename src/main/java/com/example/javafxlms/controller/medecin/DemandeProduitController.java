package com.example.javafxlms.controller.medecin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DemandeProduitController {

    @FXML
    private Button annulerDemande;

    @FXML
    private TableColumn<?, ?> dateDemandeColumn;

    @FXML
    private DatePicker dateDemandePicker;

    @FXML
    private Button envoyerDemande;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private Button modifierDemande;

    @FXML
    private TableView<?> productRequestTable;

    @FXML
    private TableColumn<?, ?> produitColumn;

    @FXML
    private ComboBox<?> produitComboBox;

    @FXML
    private TableColumn<?, ?> quantiteColumn;

    @FXML
    private Spinner<?> quantiteSpinner;

    @FXML
    private Button rechercher;

    @FXML
    private TextField searchField;

    @FXML
    private TableColumn<?, ?> statutColumn;

    @FXML
    private Label statutLabel;

    @FXML
    void annulerDemande(ActionEvent event) {

    }

    @FXML
    void date(ActionEvent event) {

    }

    @FXML
    void envoyerDemande(ActionEvent event) {

    }

    @FXML
    void modifierDemande(ActionEvent event) {

    }

    @FXML
    void produit(ActionEvent event) {

    }

    @FXML
    void rechercher(ActionEvent event) {

    }

    @FXML
    void searchField(ActionEvent event) {

    }

}
