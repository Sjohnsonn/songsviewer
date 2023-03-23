module com.example.songsviewer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.songsviewer to javafx.fxml;
    exports com.example.songsviewer;
}