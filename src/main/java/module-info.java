module com.example.christmaspresents {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.christmaspresents to javafx.fxml;
    exports com.example.christmaspresents;
    
}