package view;

// imports
import com.libraryapp.MainViewController;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainView implements ViewMaker {
    private Stage stage;

    // inject stage
    public MainView(Stage stage) {
        this.stage = stage;
    }

    @Override
    public Scene getScene() {
        // inject stage from Main into controller
        MainViewController controller = new MainViewController(stage);

        // build scene
        GridPane gridPane = createGridPane();

        Label headerLabel = new Label("Library Application");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0, 0, 2, 1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

        //Switch to check out books page
        Button checkOutBookBtn = new Button ("Check Out Books");
        GridPane.setHalignment(checkOutBookBtn, HPos.RIGHT);
        gridPane.add(checkOutBookBtn, 1, 4, 2, 1);
        checkOutBookBtn.setOnMousePressed(e -> controller.handleOnPressOutButton(e));

        // switch to check in books page
        Button checkInBookBtn = new Button("Check In Books");
        GridPane.setHalignment(checkInBookBtn, HPos.LEFT);
        gridPane.add(checkInBookBtn, 0, 4, 2, 1);
        checkInBookBtn.setOnMousePressed(e -> controller.handleOnPressInButton(e));

        Scene scene = new Scene(gridPane, 800, 500);

        // set font as arial
        scene.getRoot().setStyle("-fx-font-family: 'arial'");
        return scene;
    }
    @Override
    public GridPane createGridPane() {
        // instatiate new grid pane
        GridPane gridPane = new GridPane();

        // position pane in center
        gridPane.setAlignment(Pos.CENTER);

        //set padding
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        //horizontal and vertical gaps
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // column constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        ColumnConstraints columnTwoConstraints = new ColumnConstraints(200, 200, Double.MAX_VALUE);
        columnTwoConstraints.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstraints);

        return gridPane;
    }
}
