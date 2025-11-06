module com.example.concatenation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.concatenation to javafx.fxml;
    exports com.example.concatenation;
}