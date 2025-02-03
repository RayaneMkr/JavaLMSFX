package com.example.javafxlms.entity;

public class DossierPatient {
    private int id_dossier_patient;
    private int date_arrive;
    private int heure_arrive;
    private String symptome;
    private int gravite;
    private int ref_utilisateur;

    public DossierPatient(int id_dossier_patient, int date_arrive, int heure_arrive, String symptome, int gravite, int ref_utilisateur) {
        this.id_dossier_patient = id_dossier_patient;
        this.date_arrive = date_arrive;
        this.heure_arrive = heure_arrive;
        this.symptome = symptome;
        this.gravite = gravite;
        this.ref_utilisateur = ref_utilisateur;
    }

    public int getId_dossier_patient() {
        return id_dossier_patient;
    }

    public void setId_dossier_patient(int id_dossier_patient) {
        this.id_dossier_patient = id_dossier_patient;
    }

    public int getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(int date_arrive) {
        this.date_arrive = date_arrive;
    }

    public int getHeure_arrive() {
        return heure_arrive;
    }

    public void setHeure_arrive(int heure_arrive) {
        this.heure_arrive = heure_arrive;
    }

    public String getSymptome() {
        return symptome;
    }

    public void setSymptome(String symptome) {
        this.symptome = symptome;
    }

    public int getGravite() {
        return gravite;
    }

    public void setGravite(int gravite) {
        this.gravite = gravite;
    }

    public int getRef_utilisateur() {
        return ref_utilisateur;
    }

    public void setRef_utilisateur(int ref_utilisateur) {
        this.ref_utilisateur = ref_utilisateur;
    }
}
