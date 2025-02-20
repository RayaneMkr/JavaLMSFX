package com.example.javafxlms.repository;

import com.example.javafxlms.bdd.Bdd;
import com.example.javafxlms.entity.Hospitalisation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HospitalisationRepository {

    static Bdd connexionBdd = new Bdd();
    static Connection connection = connexionBdd.getConnection();


    public static ArrayList<Hospitalisation> recupererHospitalisations() {
        ArrayList<Hospitalisation> liste = new ArrayList<>();
        String sql = "SELECT * FROM hospitalisation";
        try {
            PreparedStatement requetePrepare = connection.prepareStatement(sql);
            ResultSet resultatRequete = requetePrepare.executeQuery();
            while (resultatRequete.next()) {
                liste.add(new Hospitalisation(
                        resultatRequete.getInt("id_hospitalisation"),
                        resultatRequete.getInt("date_debut"),
                        resultatRequete.getInt("date_fin"),
                        resultatRequete.getString("maladie"),
                        resultatRequete.getInt("num_chambre"),
                        resultatRequete.getInt("ref_utilisateur")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return liste;
    }

    public static void ajouterHospitalisation(int date_debut, int date_fin, String maladie, int num_chambre, int ref_utilisateur) {
        String sql = "INSERT INTO hospitalisation (date_debut, date_fin, maladie, num_chambre, ref_utilisateur) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, date_debut);
            requete.setInt(2, date_fin);
            requete.setString(3, maladie);
            requete.setInt(4, num_chambre);
            requete.setInt(5, ref_utilisateur);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static Hospitalisation getHospitalisationById(int id_hospitalisation) {
        String sql = "SELECT * FROM hospitalisation WHERE id_hospitalisation = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_hospitalisation);
            ResultSet resultatRequete = requete.executeQuery();
            if (resultatRequete.next()) {
                return new Hospitalisation(
                        resultatRequete.getInt("id_hospitalisation"),
                        resultatRequete.getInt("date_debut"),
                        resultatRequete.getInt("date_fin"),
                        resultatRequete.getString("maladie"),
                        resultatRequete.getInt("num_chambre"),
                        resultatRequete.getInt("ref_utilisateur")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    public static void supprimerHospitalisation(int id_hospitalisation) {
        String sql = "DELETE FROM hospitalisation WHERE id_hospitalisation = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_hospitalisation);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void mettreAJourHospitalisation(int id_hospitalisation, int date_debut, int date_fin, String maladie, int num_chambre, int ref_utilisateur) {
        String sql = "UPDATE hospitalisation SET date_debut = ?, date_fin = ?, maladie = ?, num_chambre = ?, ref_utilisateur = ? WHERE id_hospitalisation = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, date_debut);
            requete.setInt(2, date_fin);
            requete.setString(3, maladie);
            requete.setInt(4, num_chambre);
            requete.setInt(5, ref_utilisateur);
            requete.setInt(6, id_hospitalisation);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
