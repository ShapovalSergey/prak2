module prak1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    opens prak1 to javafx.fxml;
    exports prak1;
}
