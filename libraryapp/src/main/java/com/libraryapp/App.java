package com.libraryapp;

// import needed libraries
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.SceneName;
import view.CheckInBooksView;
import view.CheckOutBooksView;
import view.MainView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Map<SceneName, Scene> scenes = new HashMap<>();

    @Override
    public void start(Stage stage) throws IOException {
        // create and store scenes
        scenes.put(SceneName.MAIN, new MainView(stage).getScene());
        scenes.put(SceneName.CHECK_IN_BOOKS, new CheckInBooksView(stage).getScene());
        scenes.put(SceneName.CHECK_OUT_BOOKS, new CheckOutBooksView(stage).getScene());

        stage.setTitle("Library");

        // set scene in primary stage
        stage.setScene(scenes.get(SceneName.MAIN));
        
        stage.show();
    }

    public static Map<SceneName, Scene> getScenes() {
        return scenes;
    }

    public static void main(String[] args) {
        launch();
    }
    


}
