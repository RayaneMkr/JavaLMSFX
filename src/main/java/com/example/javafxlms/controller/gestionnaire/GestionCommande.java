package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class GestionCommande {
    public void rechercher(ActionEvent event) {
    }

    public void Ajouter(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/ajoutCommande","ajoutCommande");
    }

    public void Modifier(ActionEvent event) {
    }

    public void Annuler(ActionEvent event) {
    }

    @FXML
    void retour(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/pagePrincipale","pagePrincipale");
    }

}
