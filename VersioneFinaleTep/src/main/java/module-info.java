module com.example.versionefinaletep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.versionefinaletep to javafx.fxml;
    exports com.example.versionefinaletep;
}