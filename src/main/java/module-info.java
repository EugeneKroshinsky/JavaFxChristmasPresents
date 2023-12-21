module com.example.christmaspresents {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires com.dlsc.formsfx;

    opens com.example.christmaspresents to javafx.fxml;
    exports com.example.christmaspresents;
    exports com.example.christmaspresents.model;
    opens com.example.christmaspresents.model to javafx.fxml;
    exports com.example.christmaspresents.rest;
    opens com.example.christmaspresents.rest to javafx.fxml;
    exports com.example.christmaspresents.readers;
    opens com.example.christmaspresents.readers to javafx.fxml;

}