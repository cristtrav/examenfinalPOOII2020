module edu.snpp.examenfinalpoo2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.snpp.examenfinalpoo2 to javafx.fxml;
    exports edu.snpp.examenfinalpoo2;
}
