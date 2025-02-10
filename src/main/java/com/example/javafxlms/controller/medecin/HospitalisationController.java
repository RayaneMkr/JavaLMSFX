package com.example.javafxlms.controller.medecin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HospitalisationController {

    @FXML
    private Button ajouterHospitalisation;

    @FXML
    private TableColumn<?, ?> dateDebutColumn;

    @FXML
    private DatePicker dateDebutPicker;

    @FXML
    private TableColumn<?, ?> dateFinColumn;

    @FXML
    private DatePicker dateFinPicker;

    @FXML
    private TableView<?> hospitalizationTable;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> maladieColumn;

    @FXML
    private TextField maladieField;

    @FXML
    private Button modifierHospitalisation;

    @FXML
    private TableColumn<?, ?> numChambreColumn;

    @FXML
    private ComboBox<?> numChambreComboBox;

    @FXML
    private TableColumn<?, ?> patientColumn;

    @FXML
    private ComboBox<?> patientComboBox;

    @FXML
    private Button rechercher;

    @FXML
    private TextField searchField;

    @FXML
    private Button terminerHospitalisation;

    @FXML
    void ajouterHospitalisation(ActionEvent event) {

    }

    @FXML
    void date(ActionEvent event) {

    }

    @FXML
    void dateFinPicker(ActionEvent event) {

    }

    @FXML
    void maladie(ActionEvent event) {

    }

    @FXML
    void modifierHospitalisation(ActionEvent event) {

    }

    @FXML
    void numChambre(ActionEvent event) {

    }

    @FXML
    void patient(ActionEvent event) {

    }

    @FXML
    void rechercher(ActionEvent event) {

    }

    @FXML
    void searchField(ActionEvent event) {

    }

    @FXML
    void terminerHospitalisation(ActionEvent event) {

    }

}
