module com.example.javafx_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires eu.hansolo.fx.countries;
    requires eu.hansolo.toolbox;
    opens com.example.javafx_2 to javafx.fxml;
    exports com.example.javafx_2;
}