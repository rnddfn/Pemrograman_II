module com.example.soal1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires javafx.graphics;

    opens com.example.soal1 to javafx.fxml;
    exports com.example.soal1;
}