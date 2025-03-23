package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import com.example.javafxlms.entity.Commande;
import com.example.javafxlms.repository.CommandeRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GestionCommande implements Initializable {


    private CommandeRepository commandeRepository = new CommandeRepository();
    @FXML
    private Button ajouter;

    @FXML
    private Button annuler;

    @FXML
    private DatePicker dateCommandePicker;

    @FXML
    private ComboBox<?> fournisseurComboBox;

    @FXML
    private Button modifier;

    @FXML
    private TextField prixTotalField;

    @FXML
    private ComboBox<?> produitComboBox;

    @FXML
    private Spinner<?> quantiteSpinner;

    @FXML
    private Button rechercher;

    @FXML
    private Button retour;

    @FXML
    private TextField searchField;

    @FXML
    private ComboBox<?> statutComboBox;

    @FXML
    private TableView<Commande> tableauCommande;

    @FXML
    void Ajouter(ActionEvent event) {

    }

    @FXML
    void Annuler(ActionEvent event) {

    }

    @FXML
    void Modifier(ActionEvent event) {

    }

    @FXML
    void champRecherche(ActionEvent event) {

    }

    @FXML
    void fournisseur(ActionEvent event) {

    }

    @FXML
    void produit(ActionEvent event) {

    }

    @FXML
    void rechercher(ActionEvent event) {

    }

    @FXML
    void retour(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/pagePrincipale","GestionCommandeToPagePrincipale");

    }

    @FXML
    void statut(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[][] colonnes = {
                {"Prix","prix"},
                {"Quantite","quantite"},
                {"Etat","etat"},
                {"Date de commande","date_commande"},
                {"Fournisseur","ref_fournisseur"},
                {"Produit","ref_produit"},
        };
        for (int i = 0; i < colonnes.length; i++) {
            TableColumn<Commande, String> macolonne = new TableColumn<>(colonnes[i][0]);
            macolonne.setCellValueFactory(new PropertyValueFactory<>(colonnes[i][1]));
            tableauCommande.getColumns().add(macolonne);
        }
        ArrayList<Commande> list = commandeRepository.recupererCommandes();
        System.out.println(list.size());
        System.out.println(list.getFirst());
        tableauCommande.getItems().addAll(list);
    }
}
