package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import com.example.javafxlms.repository.CommandeRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;


import static com.example.javafxlms.controller.gestionnaire.AjoutProduit.afficherMessage;

public class AjoutCommande {

    @FXML
    private Button Retour;

    @FXML
    private Button ajouter;

    @FXML
    private DatePicker date;

    @FXML
    private TextField etat;

    @FXML
    private TextField prix;

    @FXML
    private TextField quantite;

    @FXML
    void ajouter(ActionEvent event) {
        int prixInt = Integer.parseInt(prix.getText());
        int quantiteInt = Integer.parseInt(quantite.getText());
        int etatInt = Integer.parseInt(etat.getText());
        Date dateCreation = Date.valueOf(date.getValue());



        if (prixInt==0 || quantiteInt==0 || etatInt==0 || date == null) {
            afficherMessage("Erreur", "Veuillez remplir tous les champs.");
            return;
        }

        try {
            CommandeRepository.AjouterUneCommande(quantiteInt, prixInt, etatInt, dateCreation,1,1);
            afficherMessage("Succès", "Le produit a été ajouté avec succès.");


            prix.clear();
            quantite.clear();
            etat.clear();
            date.setValue(null);

        } catch (NumberFormatException e) {
            afficherMessage("Erreur", "Le statut doit être un nombre.");
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
    void retour(ActionEvent event) throws IOException {
        HelloApplication.changeScene("pageGestionnaire/gestionCommande","gestionCommande");

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
