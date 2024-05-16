module com.empresa.datastructures19 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.datastructures19 to javafx.fxml;
    exports com.empresa.datastructures19;
}