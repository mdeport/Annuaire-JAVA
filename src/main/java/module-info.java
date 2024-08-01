module org.mateo.annuaire {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mateo.annuaire to javafx.fxml;
    exports org.mateo.annuaire;
}