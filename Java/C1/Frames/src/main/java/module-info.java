module com.example.frames {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.frames to javafx.fxml;
    exports com.example.frames;
}