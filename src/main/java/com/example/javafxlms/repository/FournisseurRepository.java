package com.example.javafxlms.repository;

import com.example.javafxlms.bdd.Bdd;
import com.example.javafxlms.entity.Fournisseur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FournisseurRepository {

    static Bdd connexionBdd = new Bdd();
    static Connection connection = connexionBdd.getConnection();


    public static ArrayList<Fournisseur> recupererFournisseurs() {
        ArrayList<Fournisseur> liste = new ArrayList<>();
        String sql = "SELECT * FROM fournisseur";
        try {
            PreparedStatement requetePrepare = connection.prepareStatement(sql);
            ResultSet resultatRequete = requetePrepare.executeQuery();
            while (resultatRequete.next()) {
                liste.add(new Fournisseur(
                        resultatRequete.getInt("id_fournisseur"),
                        resultatRequete.getString("nom"),
                        resultatRequete.getString("email"),
                        resultatRequete.getString("rue"),
                        resultatRequete.getInt("cp"),
                        resultatRequete.getString("ville")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return liste;
    }

    public static void ajouterFournisseur(String nom, String email, String rue, int cp, String ville) {
        String sql = "INSERT INTO fournisseur (nom, email, rue, cp, ville) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setString(1, nom);
            requete.setString(2, email);
            requete.setString(3, rue);
            requete.setInt(4, cp);
            requete.setString(5, ville);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static Fournisseur getFournisseurById(int id_fournisseur) {
        String sql = "SELECT * FROM fournisseur WHERE id_fournisseur = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_fournisseur);
            ResultSet resultatRequete = requete.executeQuery();
            if (resultatRequete.next()) {
                return new Fournisseur(
                        resultatRequete.getInt("id_fournisseur"),
                        resultatRequete.getString("nom"),
                        resultatRequete.getString("email"),
                        resultatRequete.getString("rue"),
                        resultatRequete.getInt("cp"),
                        resultatRequete.getString("ville")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    public static void supprimerFournisseur(int id_fournisseur) {
        String sql = "DELETE FROM fournisseur WHERE id_fournisseur = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_fournisseur);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void mettreAJourFournisseur(int id_fournisseur, String nom, String email, String rue, int cp, String ville) {
        String sql = "UPDATE fournisseur SET nom = ?, email = ?, rue = ?, cp = ?, ville = ? WHERE id_fournisseur = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setString(1, nom);
            requete.setString(2, email);
            requete.setString(3, rue);
            requete.setInt(4, cp);
            requete.setString(5, ville);
            requete.setInt(6, id_fournisseur);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
