module com.example.shirtorderfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.shirtorderfx to javafx.fxml;
    exports com.example.shirtorderfx;
}