module com.example.graprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.graprojekt to javafx.fxml;
    exports com.example.graprojekt;
}