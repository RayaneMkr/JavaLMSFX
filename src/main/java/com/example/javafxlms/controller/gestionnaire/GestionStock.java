package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GestionStock {

    @FXML
    private TableColumn<?, ?> dangerositeColumn;

    @FXML
    private Spinner<?> dangerositeSpinner;

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
    private TableView<?> productTable;

    @FXML
    private TableColumn<?, ?> quantiteColumn;

    @FXML
    private Spinner<?> quantiteSpinner;

    @FXML
    private Button retour;

    @FXML
    private TextField searchField;

    @FXML
    private TableColumn<?, ?> seuilAlerteColumn;

    @FXML
    private Spinner<?> seuilAlerteSpinner;

    @FXML
    void Ajouter(ActionEvent event) {

    }

    @FXML
    void Modifier(ActionEvent event) {

    }

    @FXML
    void Rechercher(ActionEvent event) {

    }

    @FXML
    void Retour(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/pagePrincipale","pagPrincipale");
    }

    @FXML
    void Supprimer(ActionEvent event) {

    }

}
