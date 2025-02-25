package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.repository.ProduitRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

import java.time.LocalDate;

public class AjoutProduit {

    @FXML
    private Button ajouter;

    @FXML
    private TextField dangerosite;

    @FXML
    private DatePicker date;

    @FXML
    private TextField description;

    @FXML
    private TextField libelle;

    @FXML
    void ajouter(ActionEvent event) {
        // Récupération des valeurs des champs
        String libelleText = libelle.getText();
        String descriptionText = description.getText();
        String dangerositeText = dangerosite.getText();
        LocalDate dateCreation = date.getValue();


        // Vérification si les champs sont remplis
        if (libelleText.isEmpty() || descriptionText.isEmpty() || dangerositeText.isEmpty() || dateCreation == null) {
            afficherMessage("Erreur", "Veuillez remplir tous les champs.");
            return;
        }

        try {
            // Conversion de la dangerosité en entier
            int dangerositeInt = Integer.parseInt(dangerositeText);

            // Conversion de la date en nombre de jours depuis 1970
            int dateCreationInt = (int) dateCreation.toEpochDay();

            // Ajout du produit dans la base de données
            // On utilise 1 comme ID utilisateur par défaut
            ProduitRepository.ajouterProduit(libelleText, descriptionText, dangerositeInt, dateCreationInt, 1);

            // Affichage d'un message de succès
            afficherMessage("Succès", "Le produit a été ajouté avec succès.");

            // Réinitialisation des champs
            libelle.clear();
            description.clear();
            dangerosite.clear();
            date.setValue(null);

        } catch (NumberFormatException e) {
            afficherMessage("Erreur", "La dangerosité doit être un nombre.");
        } catch (Exception e) {
            afficherMessage("Erreur", "Une erreur est survenue : " + e.getMessage());
        }
    }

    @FXML
    void dangerosite(ActionEvent event) {

    }

    @FXML
    void dateProduit(ActionEvent event) {

    }

    @FXML
    void description(ActionEvent event) {

    }

    @FXML
    void libelle(ActionEvent event) {

    }

    private void afficherMessage(String titre, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titre);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}