module com.example.csc311hw2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311hw2 to javafx.fxml;
    exports com.example.csc311hw2;
}