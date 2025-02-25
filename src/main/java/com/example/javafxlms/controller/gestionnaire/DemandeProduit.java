package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DemandeProduit {


    @FXML
    private TableColumn<?, ?> dateDemandeColumn;

    @FXML
    private DatePicker dateDemandePicker;

    @FXML
    private TableColumn<?, ?> demandeurColumn;

    @FXML
    private TextField demandeurField;

    @FXML
    private TableColumn<?, ?> idColumn;

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
    private TableView<?> requestTable;

    @FXML
    private TextField searchField;

    @FXML
    private TableColumn<?, ?> statutColumn;

    @FXML
    private ComboBox<?> statutComboBox;

    @FXML
    void Ajouter(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/AjoutProduit","AjoutProduit");
    }

    @FXML
    void Valider(ActionEvent event) {

    }

    @FXML
    void barrerecherche(ActionEvent event) {

    }

    @FXML
    void rechercher(ActionEvent event) {

    }

    @FXML
    void refuser(ActionEvent event) {

    }

    @FXML
    void tableau(ActionEvent event) {

    }

}
