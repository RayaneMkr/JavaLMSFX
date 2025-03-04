package com.example.javafxlms.controller;

import com.example.javafxlms.HelloApplication;
import com.example.javafxlms.entity.Roles;
import com.example.javafxlms.entity.UserConnecte;
import com.example.javafxlms.repository.UtilisateurRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;

import java.io.IOException;

public class RegisterController {

    @FXML
    private TextField nomField;

    @FXML
    private TextField prenomField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField numSecuField;

    @FXML
    private Label erreur;

    public RegisterController() throws IOException {
        if (UserConnecte.getINSTANCE()==null) {
            HelloApplication.changeScene("accueil/login");
        } else if (UserConnecte.getINSTANCE().getRole()!= Roles.getIdRole(Roles.ADMIN)) {
            HelloApplication.changeScene("accueil/login");
        }
    }

    @FXML
    protected void inscription() {
        if (nomField.getText().isEmpty() || prenomField.getText().isEmpty() ||
                emailField.getText().isEmpty() || passwordField.getText().isEmpty()) {
            showAlert("Erreur", "Tous les champs sont obligatoires sauf le numéro de sécurité sociale.");
        } else {
            UtilisateurRepository.inscription(nomField.getText(),prenomField.getText(),emailField.getText(),passwordField.getText(),6, erreur);
            // Implement user registration logic here
        }
    }

    @FXML
    protected void handleBackToLogin() {
        System.out.println("Back to login clicked");
        // Implement navigation back to login page here
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
