module com.example.dollartolkrconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.dollartolkrconverter to javafx.fxml;
    exports com.example.dollartolkrconverter;
}