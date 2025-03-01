package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import javafx.event.ActionEvent;

public class GestionFournisseur {
    public void Rechercher(ActionEvent event) {
    }

    public void Ajouter(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/ajoutFournisseur","ajoutFournisseur");
    }

    public void Modifier(ActionEvent event) {
    }

    public void Supprimer(ActionEvent event) {
    }

    public void Retour(ActionEvent actionEvent) {
        HelloApplication.changeScene("pageGestionnaire/pagePrincipale","pagPrincipale");
    }
}
