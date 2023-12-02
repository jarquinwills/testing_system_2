module com.example.immigrationsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.immigrationsystem to javafx.fxml;
    exports com.example.immigrationsystem;
}