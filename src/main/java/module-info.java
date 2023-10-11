module com.example.colorchooserapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens com.example.colorchooserapp to javafx.fxml;
    exports com.example.colorchooserapp;
}