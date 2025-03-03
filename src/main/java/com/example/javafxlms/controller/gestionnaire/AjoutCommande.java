package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.repository.ProduitRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.time.LocalDate;


import static com.example.javafxlms.controller.gestionnaire.AjoutProduit.afficherMessage;

public class AjoutCommande {

    @FXML
    private Button Retour;

    @FXML
    private Button ajouter;

    @FXML
    private AnchorPane date_commande;

    @FXML
    private TextField etat;

    @FXML
    private TextField prix;

    @FXML
    private TextField quantite;

    @FXML
    void ajouter(ActionEvent event) {
       String prixText = prix.getText();
       String quantiteText = quantite.getText();
       String etatText = etat.getText();
       LocalDate dateCreation = date_commande.getValue();



        if (prixText.isEmpty() || quantiteText.isEmpty() || etatText.isEmpty() || date_commande == null) {
            afficherMessage("Erreur", "Veuillez remplir tous les champs.");
            return;
        }

        try {
            int prixInt = Integer.parseInt(prixText);
            int quantiteInt = Integer.parseInt(quantiteText);
            int etatInt = Integer.parseInt(quantiteText);

            ProduitRepository.ajouterProduit(prixText, quantiteText, etatInt, date_commande, 1);

            // Affichage d'un message de succès
            afficherMessage("Succès", "Le produit a été ajouté avec succès.");

            // Réinitialisation des champs
            prix.clear();
            quantite.clear();
            etat.clear();
            date_commande.setValue(null);

        } catch (NumberFormatException e) {
            afficherMessage("Erreur", "La dangerosité doit être un nombre.");
        } catch (Exception e) {
            afficherMessage("Erreur", "Une erreur est survenue : " + e.getMessage());
        }
    }

    @FXML
    void dateCommande(MouseEvent event) {

    }

    @FXML
    void dateProduit(ActionEvent event) {

    }

    @FXML
    void etat(ActionEvent event) {

    }

    @FXML
    void prix(ActionEvent event) {

    }

    @FXML
    void quantite(ActionEvent event) {

    }

    @FXML
    void retour(ActionEvent event) {

    }

    public TextField getPrix() {
        return prix;
    }

    public void setPrix(TextField prix) {
        this.prix = prix;
    }

    public TextField getQuantite() {
        return quantite;
    }

    public void setQuantite(TextField quantite) {
        this.quantite = quantite;
    }

    public TextField getEtat() {
        return etat;
    }

    public void setEtat(TextField etat) {
        this.etat = etat;
    }

    public AnchorPane getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(AnchorPane date_commande) {
        this.date_commande = date_commande;
    }

    public Button getAjouter() {
        return ajouter;
    }

    public void setAjouter(Button ajouter) {
        this.ajouter = ajouter;
    }

    public Button getRetour() {
        return Retour;
    }

    public void setRetour(Button retour) {
        Retour = retour;
    }
}
