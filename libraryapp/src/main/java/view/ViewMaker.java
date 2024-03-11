package view;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public interface ViewMaker {
    // build and return scene
    Scene getScene();
    GridPane createGridPane();
    
}
