package com.example.javafxlms.repository;

import com.example.javafxlms.bdd.Bdd;
import com.example.javafxlms.entity.Produit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProduitRepository {

    static Bdd connexionBdd = new Bdd();
    static Connection connection = connexionBdd.getConnection();


    public static ArrayList<Produit> recupererProduits() {
        ArrayList<Produit> liste = new ArrayList<>();
        String sql = "SELECT * FROM produit";
        try {
            PreparedStatement requetePrepare = connection.prepareStatement(sql);
            ResultSet resultatRequete = requetePrepare.executeQuery();
            while (resultatRequete.next()) {
                liste.add(new Produit(
                        resultatRequete.getInt("id_produit"),
                        resultatRequete.getString("libelle"),
                        resultatRequete.getString("description"),
                        resultatRequete.getInt("dangerosite"),
                        resultatRequete.getInt("date_creation"),
                        resultatRequete.getInt("ref_utilisateur")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return liste;
    }


    public static void ajouterProduit(String libelle, String description, int dangerosite, int date_creation, int ref_utilisateur) {
        String sql = "INSERT INTO produit (libelle, description, dangerosite, date_creation, ref_utilisateur) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setString(1, libelle);
            requete.setString(2, description);
            requete.setInt(3, dangerosite);
            requete.setInt(4, date_creation);
            requete.setInt(5, ref_utilisateur);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static Produit getProduitById(int id_produit) {
        String sql = "SELECT * FROM produit WHERE id_produit = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_produit);
            ResultSet resultatRequete = requete.executeQuery();
            if (resultatRequete.next()) {
                return new Produit(
                        resultatRequete.getInt("id_produit"),
                        resultatRequete.getString("libelle"),
                        resultatRequete.getString("description"),
                        resultatRequete.getInt("dangerosite"),
                        resultatRequete.getInt("date_creation"),
                        resultatRequete.getInt("ref_utilisateur")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void supprimerProduit(int id_produit) {
        String sql = "DELETE FROM produit WHERE id_produit = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_produit);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void modifierProduit(int id_produit, String libelle, String description, int dangerosite, int date_creation, int ref_utilisateur) {
        String sql = "UPDATE produit SET libelle = ?, description = ?, dangerosite = ?, date_creation = ?, ref_utilisateur = ? WHERE id_produit = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setString(1, libelle);
            requete.setString(2, description);
            requete.setInt(3, dangerosite);
            requete.setInt(4, date_creation);
            requete.setInt(5, ref_utilisateur);
            requete.setInt(6, id_produit);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
