module com.example.proyectou6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectou6 to javafx.fxml;
    exports com.example.proyectou6;
}