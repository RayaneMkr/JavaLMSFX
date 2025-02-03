module com.example.javafxlms {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires spring.security.crypto;

    opens com.example.javafxlms to javafx.fxml;
    exports com.example.javafxlms;
}