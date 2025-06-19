module com.tlong.mavenproject3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.tlong.mavenproject3 to javafx.fxml;
    exports com.tlong.mavenproject3;
}
