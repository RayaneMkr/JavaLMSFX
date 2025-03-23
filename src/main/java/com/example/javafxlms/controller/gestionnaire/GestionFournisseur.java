package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import com.example.javafxlms.entity.Commande;
import com.example.javafxlms.entity.Fournisseur;
import com.example.javafxlms.repository.FournisseurRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GestionFournisseur implements Initializable {

    private FournisseurRepository fournisseurRepository = new FournisseurRepository();

    @FXML
    private Button ajouter;

    @FXML
    private Button modifier;

    @FXML
    private Button rechercher;

    @FXML
    private Button retour;

    @FXML
    private TextField searchField;

    @FXML
    private Button supprimer;

    @FXML
    private TableView<Fournisseur> tableauFournisseur;

    @FXML
    void Ajouter(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/ajoutFournisseur","ajoutFournisseur");
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

    @FXML
    void searchField(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[][] colonnes = {
                {"Id","id_fournisseur"},
                {"nom","nom"},
                {"email","email"},
                {"rue","rue"},
                {"cp","cp"},
                {"ville","ville"},
        };
        for (int i = 0; i < colonnes.length; i++) {
            TableColumn<Fournisseur, String> macolonne = new TableColumn<>(colonnes[i][0]);
            macolonne.setCellValueFactory(new PropertyValueFactory<>(colonnes[i][1]));
            tableauFournisseur.getColumns().add(macolonne);
        }
        ArrayList<Fournisseur> list = fournisseurRepository.recupererFournisseurs();
        System.out.println(list.size());
        System.out.println(list.getFirst());
        tableauFournisseur.getItems().addAll(list);
    }


}
