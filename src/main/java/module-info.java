module com.example.javafxlms {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires spring.security.crypto;

    opens com.example.javafxlms to javafx.fxml;
    exports com.example.javafxlms;
    exports com.example.javafxlms.controller;
    exports com.example.javafxlms.controller.admin;
    exports com.example.javafxlms.controller.secretaire;
    exports com.example.javafxlms.controller.medecin;
    exports com.example.javafxlms.controller.gestionnaire;
    opens com.example.javafxlms.controller.gestionnaire to javafx.fxml;
    opens com.example.javafxlms.controller.medecin to javafx.fxml;
    opens com.example.javafxlms.controller.secretaire to javafx.fxml;
    opens com.example.javafxlms.controller.admin to javafx.fxml;
    opens com.example.javafxlms.controller to javafx.fxml;

}