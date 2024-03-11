package view;

//import needed libraries
import java.util.ArrayList;

import classes.Book;
import com.libraryapp.CheckOutBooksController;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CheckOutBooksView implements ViewMaker {

    private Stage stage;

    public CheckOutBooksView (Stage stage) {
        this.stage = stage;
    }

    @Override
    public Scene getScene () {

         // create vbox to hold checkboxes
         VBox vbox = new VBox();
         vbox.setPrefWidth(300); // Set the width of vbox
         
        //inject controller
        CheckOutBooksController controller = new CheckOutBooksController(vbox, stage);

        // build scene
        GridPane gridPane = createGridPane();

        // header
        Label headerLabel = new Label("Check Out Books");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0, 0, 2, 1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

        // display list of checked out books
        
       

        ArrayList<Book> books = classes.Library.getAllBooks();
        for (Book book : books) {
            if ((book.getAvailable())) {
                CheckBox checkBox = new CheckBox(book.getTitle());
                checkBox.setPrefWidth(400);
                vbox.getChildren().add(checkBox);
            }
        }

        Button checkOutBtn = new Button("Check Out");
        GridPane.setHalignment(checkOutBtn, HPos.CENTER);
        gridPane.add(checkOutBtn, 0, 4, 2, 1);
        checkOutBtn.setOnMousePressed(e -> controller.handleOnPressCheckOutButton(e));

        Button backBtn = new Button("BACK");
        GridPane.setHalignment(backBtn, HPos.CENTER);
        gridPane.add(backBtn, 0, 6, 2, 1);
        backBtn.setOnMousePressed(e -> controller.handleOnPressBackButton(e));

        // add vbox to gridpane
        gridPane.add(vbox, 1, 1);

        // create scene
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
