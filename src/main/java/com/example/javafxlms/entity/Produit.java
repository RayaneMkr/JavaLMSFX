package com.example.javafxlms.entity;

public class Produit {
    private int id_produit;
    private String libelle;
    private String description;
    private int dangerosite;
    private int date_creation;
    private int ref_utilisateur;

    public Produit(int id_produit, String libelle, String description, int dangerosite, int date_creation, int ref_utilisateur) {
        this.id_produit = id_produit;
        this.libelle = libelle;
        this.description = description;
        this.dangerosite = dangerosite;
        this.date_creation = date_creation;
        this.ref_utilisateur = ref_utilisateur;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDangerosite() {
        return dangerosite;
    }

    public void setDangerosite(int dangerosite) {
        this.dangerosite = dangerosite;
    }

    public int getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(int date_creation) {
        this.date_creation = date_creation;
    }

    public int getRef_utilisateur() {
        return ref_utilisateur;
    }

    public void setRef_utilisateur(int ref_utilisateur) {
        this.ref_utilisateur = ref_utilisateur;
    }
}
