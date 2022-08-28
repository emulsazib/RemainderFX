module com.example.remainderfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.remainderfx to javafx.fxml;
    exports com.example.remainderfx;
}