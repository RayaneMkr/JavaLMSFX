package com.example.javafxlms.entity;

public class UserConnecte extends Utilisateur{
    public UserConnecte(Utilisateur utilisateur) {
        super(utilisateur.getId_utilisateur(),utilisateur.getNom(),utilisateur.getPrenom(),utilisateur.getEmail(),utilisateur.getMdp(),utilisateur.getRole());
    }

    private static Utilisateur INSTANCE;

    public static boolean initInstance(Utilisateur utilisateur){
        if (INSTANCE==null) {
            INSTANCE = new UserConnecte(utilisateur);
            return true;
        }
        return false;
    }

    public static Utilisateur getINSTANCE() {
        return INSTANCE;
    }
    public static boolean clearInstance(){
        if (INSTANCE!=null){
            INSTANCE=null;
            return true;
        }
        return false;
    }

}
