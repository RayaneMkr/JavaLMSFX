package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import com.example.javafxlms.repository.FournisseurRepository;
import com.example.javafxlms.repository.ProduitRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class AjoutFournisseur {

    @FXML
    private Button Retour;

    @FXML
    private Button ajouter;

    @FXML
    private TextField cp;

    @FXML
    private TextField email;

    @FXML
    private TextField nom;

    @FXML
    private TextField rue;

    @FXML
    private TextField ville;

    @FXML
    void ajouter(ActionEvent event) {
        String nomText = nom.getText();
        String emailText = email.getText();
        String rueText = rue.getText();
        int cpInt = Integer.parseInt(cp.getText());
        String villeText = ville.getText();



        if (nomText.isEmpty() || emailText.isEmpty() || rueText.isEmpty() || cpInt == 0 || villeText.isEmpty()) {
            AjoutProduit.afficherMessage("Erreur", "Veuillez remplir tous les champs.");
            return;
        }

        try {

           FournisseurRepository.ajouterFournisseur(nomText, emailText, rueText, cpInt, villeText);

           AjoutProduit.afficherMessage("Succès", "Le produit a été ajouté avec succès.");

           nom.clear();
           email.clear();
           rue.clear();
           cp.clear();
           ville.clear();

        } catch (NumberFormatException e) {
           AjoutProduit.afficherMessage("Erreur", "Le code postale doit être un nombre.");
        } catch (Exception e) {
            AjoutProduit.afficherMessage("Erreur", "Une erreur est survenue : " + e.getMessage());
        }

    }

    @FXML
    void cp(ActionEvent event) {

    }

    @FXML
    void email(ActionEvent event) {

    }

    @FXML
    void nom(ActionEvent event) {

    }

    @FXML
    void retour(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/gestionFournisseur","gestionFournisseur");

    }

    @FXML
    void rue(ActionEvent event) {

    }

    @FXML
    void ville(ActionEvent event) {

    }

}
