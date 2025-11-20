module com.example.labtestsample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labtestsample to javafx.fxml;
    exports com.example.labtestsample;
}