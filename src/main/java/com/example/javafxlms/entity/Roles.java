package com.example.javafxlms.entity;

public enum Roles {
    ADMIN,
    MEDECIN,
    SECRETAIRE,
    GESTIONNAIRE,
    PATIENT;

    public static int getIdRole(Roles role){
        switch (role){
            case ADMIN :
                return 5;
            case MEDECIN:
                return 2;
            case PATIENT:
                return 4;
            case SECRETAIRE:
                return 1;
            case GESTIONNAIRE:
                return 3;
        }
        return 0;
    }

}
