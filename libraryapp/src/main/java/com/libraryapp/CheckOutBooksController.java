package com.libraryapp;

import classes.Book;
import classes.Library;

//import needed libraries
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.SceneName;
import javafx.scene.layout.VBox;


public class CheckOutBooksController {
    private final VBox vbox;
    private Stage stage;

    // constructor
    public CheckOutBooksController (VBox vbox, Stage stage) {
        this.vbox = vbox;
        this.stage = stage;
    }

    public void handleOnPressCheckOutButton (MouseEvent e) {
        for (javafx.scene.Node node : vbox.getChildren()) {
        if (node instanceof CheckBox) {
            CheckBox checkBox = (CheckBox) node;
            if (checkBox.isSelected()) {
                String title = checkBox.getText();
                for (Book book : Library.getAllBooks()) {
                    if (book.getTitle().equals(title)) {
                        book.setAvailable(false); 
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
