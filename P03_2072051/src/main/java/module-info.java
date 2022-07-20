module com.example.p03_2072051 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.p03_2072051 to javafx.fxml;
    exports com.example.p03_2072051;

    exports com.example.p03_2072051.controller;
    opens com.example.p03_2072051.controller to javafx.fxml;

    exports com.example.p03_2072051.model;
    opens com.example.p03_2072051.model to javafx.fxml;
}
