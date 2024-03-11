package com.libraryapp;

// import libraries
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.SceneName;

public class MainViewController {

    private Stage stage;

    // constructor
    public MainViewController (Stage stage) {
        this.stage = stage;
    }

    public void handleOnPressOutButton(MouseEvent event) {
        stage.setScene(App.getScenes().get(SceneName.CHECK_OUT_BOOKS));
    }

    public void handleOnPressInButton(MouseEvent event) {
        stage.setScene(App.getScenes().get(SceneName.CHECK_IN_BOOKS));
    }
}
