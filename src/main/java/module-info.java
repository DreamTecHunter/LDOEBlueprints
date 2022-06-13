module com.gaming.ldoeblueprints {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.gaming.ldoeblueprints to javafx.fxml;
    exports com.gaming.ldoeblueprints;
}