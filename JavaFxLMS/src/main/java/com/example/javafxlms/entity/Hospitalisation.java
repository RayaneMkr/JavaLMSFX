package com.example.javafxlms.entity;

public class Hospitalisation {
    private int id_hospitalisation;
    private int date_debut;
    private int date_fin;
    private String maladie;
    private int num_chambre;
    private int ref_utilisateur;

    public int getId_hospitalisation() {
        return id_hospitalisation;
    }

    public void setId_hospitalisation(int id_hospitalisation) {
        this.id_hospitalisation = id_hospitalisation;
    }

    public int getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(int date_debut) {
        this.date_debut = date_debut;
    }

    public int getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(int date_fin) {
        this.date_fin = date_fin;
    }

    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    public int getNum_chambre() {
        return num_chambre;
    }

    public void setNum_chambre(int num_chambre) {
        this.num_chambre = num_chambre;
    }

    public int getRef_utilisateur() {
        return ref_utilisateur;
    }

    public void setRef_utilisateur(int ref_utilisateur) {
        this.ref_utilisateur = ref_utilisateur;
    }
}
