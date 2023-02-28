module com.example.figurasgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.figurasgui to javafx.fxml;
    exports com.example.figurasgui;
}