package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import com.example.javafxlms.entity.Commande;
import com.example.javafxlms.repository.CommandeRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;

import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

public class GestionCommande implements Initializable {


    private CommandeRepository commandeRepository = new CommandeRepository();
    @FXML
    private Button ajouter;
    @FXML
    private Label erreur;

    @FXML
    private Button annuler;

    @FXML
    private Button supprimer;

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
    void Supprimer(ActionEvent event) {

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
    @FXML
    void onListeSelection(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            TablePosition<Commande, ?> cell = tableauCommande.getSelectionModel().getSelectedCells().get(0);
            int indexLigne = cell.getRow();
            TableColumn<Commande, ?> colonne = cell.getTableColumn();
            Commande commandeSelectionnee = tableauCommande.getItems().get(indexLigne);

            if (event.getClickCount() == 2) {

                System.out.println("Double-clique ligne " + indexLigne + " , colonne " + colonne.getText() + " : " + commandeSelectionnee);
                HelloApplication.changeScene("pageGestionnaire/modifierCommande", new ModifierCommande(commandeSelectionnee));

            } else if (event.getClickCount() == 1) {

                System.out.println("Simple-clique ligne " + indexLigne + " , colonne " + colonne.getText() + " : " + commandeSelectionnee);
                supprimer.setVisible(true);

                int id = commandeSelectionnee.getId_commande();
                supprimer.setOnAction(event1 -> {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmation de suppression");
                    alert.setHeaderText("Êtes-vous sûr de vouloir supprimer cette commande ?");
                    Optional<ButtonType> result = alert.showAndWait();

                    if (result.isPresent() && result.get() == ButtonType.OK) {
                        commandeRepository.supprimerCommande(id, erreur);
                        supprimer.setVisible(false);
                        tableauCommande.getItems().remove(indexLigne);
                    } else {
                        erreur.setText("Suppression annulée");
                        supprimer.setVisible(false);
                    }
                });
            }
        }
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
