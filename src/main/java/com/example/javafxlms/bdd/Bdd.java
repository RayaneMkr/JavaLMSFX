package com.example.javafxlms.bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Bdd {
    private String serveur = "localhost";
    private String nomDeLaBase = "javafx_lms";
    private String utilisateur = "root";
    private String motDePasse = "";

    private String getUrl() {
        return "jdbc:mysql://" + serveur + "/" + nomDeLaBase;
    }

    public Connection getConnection() {
        try {
            Connection cnx = DriverManager.getConnection(getUrl(), utilisateur, motDePasse);
            System.out.println("État de connexion : ");
            System.out.println(cnx.isClosed() ? "Fermée" : "Ouverte \r\n");
            return cnx;
        } catch (SQLException e) {
            System.out.println("Erreur lors de la tentative de connexion à la base de données.");
            e.printStackTrace();
            return null;
        }
    }
    }


