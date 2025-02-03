package com.example.javafxlms.repository;

import com.example.javafxlms.bdd.Bdd;
import com.example.javafxlms.entity.DossierPatient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DossierPatientRepository {

    static Bdd connexionBdd = new Bdd();
    static Connection connection = connexionBdd.getConnection();

    // Récupérer tous les dossiers patients
    public static ArrayList<DossierPatient> recupererDossiersPatients() {
        ArrayList<DossierPatient> liste = new ArrayList<>();
        String sql = "SELECT * FROM dossier_patient";
        try {
            PreparedStatement requetePrepare = connection.prepareStatement(sql);
            ResultSet resultatRequete = requetePrepare.executeQuery();
            while (resultatRequete.next()) {
                liste.add(new DossierPatient(
                        resultatRequete.getInt("id_dossier_patient"),
                        resultatRequete.getInt("date_arrive"),
                        resultatRequete.getInt("heure_arrive"),
                        resultatRequete.getString("symptome"),
                        resultatRequete.getInt("gravite"),
                        resultatRequete.getInt("ref_utilisateur")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return liste;
    }

    // Ajouter un dossier patient
    public static void ajouterDossierPatient(int date_arrive, int heure_arrive, String symptome, int gravite, int ref_utilisateur) {
        String sql = "INSERT INTO dossier_patient (date_arrive, heure_arrive, symptome, gravite, ref_utilisateur) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, date_arrive);
            requete.setInt(2, heure_arrive);
            requete.setString(3, symptome);
            requete.setInt(4, gravite);
            requete.setInt(5, ref_utilisateur);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Récupérer un dossier patient par son ID
    public static DossierPatient getDossierPatientById(int id_dossier_patient) {
        String sql = "SELECT * FROM dossier_patient WHERE id_dossier_patient = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_dossier_patient);
            ResultSet resultatRequete = requete.executeQuery();
            if (resultatRequete.next()) {
                return new DossierPatient(
                        resultatRequete.getInt("id_dossier_patient"),
                        resultatRequete.getInt("date_arrive"),
                        resultatRequete.getInt("heure_arrive"),
                        resultatRequete.getString("symptome"),
                        resultatRequete.getInt("gravite"),
                        resultatRequete.getInt("ref_utilisateur")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    // Supprimer un dossier patient
    public static void supprimerDossierPatient(int id_dossier_patient) {
        String sql = "DELETE FROM dossier_patient WHERE id_dossier_patient = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_dossier_patient);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Mettre à jour un dossier patient
    public static void mettreAJourDossierPatient(int id_dossier_patient, int date_arrive, int heure_arrive, String symptome, int gravite, int ref_utilisateur) {
        String sql = "UPDATE dossier_patient SET date_arrive = ?, heure_arrive = ?, symptome = ?, gravite = ?, ref_utilisateur = ? WHERE id_dossier_patient = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, date_arrive);
            requete.setInt(2, heure_arrive);
            requete.setString(3, symptome);
            requete.setInt(4, gravite);
            requete.setInt(5, ref_utilisateur);
            requete.setInt(6, id_dossier_patient);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
