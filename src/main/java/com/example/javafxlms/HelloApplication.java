package com.example.javafxlms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage maStage;
    @Override
    public void start(Stage stage) throws IOException {
        maStage= stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("accueil/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        maStage.setTitle("Hello!");
        maStage.setScene(scene);
        maStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void changeScene(String fxml , String nomScene) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml+".fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
            maStage.setTitle(nomScene);
            maStage.setScene(scene);
            maStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void changeScene(String nomDuFichierFxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nomDuFichierFxml + ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 760);
       maStage.setScene(scene);
        maStage.show();
    }

    public static void changeScene(String fxml, Object controlleur) {
        maStage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml+".fxml"));
        fxmlLoader.setController(controlleur);
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
            maStage.setTitle("Hello!");
            maStage.setScene(scene);
            maStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}