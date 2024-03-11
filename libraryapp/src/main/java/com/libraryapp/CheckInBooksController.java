package com.libraryapp;

import classes.Book;
import classes.Library;

//import needed libraries
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.SceneName;

public class CheckInBooksController {

    private Stage stage;
    private final VBox vbox;
    
    // constructor
    public CheckInBooksController (Stage stage, VBox vbox) {
        this.stage = stage;
        this.vbox = vbox;
    }

    public void handleOnPressCheckInButton (MouseEvent e) {
        // get checkbox values and update available status
        for (javafx.scene.Node node : vbox.getChildren()) {
        if (node instanceof CheckBox) {
            CheckBox checkBox = (CheckBox) node;
            if (checkBox.isSelected()) {
                String title = checkBox.getText();
                for (Book book : Library.getAllBooks()) {
                    if (book.getTitle().equals(title)) {
                        book.setAvailable(true);
                        break;
                    }
                }
            }
        }
    }
    stage.setScene(App.getScenes().get(SceneName.MAIN));
    }

    public void handleOnPressBackButton (MouseEvent e) {
        stage.setScene(App.getScenes().get(SceneName.MAIN));
    }
}