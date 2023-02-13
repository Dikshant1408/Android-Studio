module com.example.frame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.frame to javafx.fxml;
    exports com.example.frame;
}