package Lab13;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Random;

public class Main extends Application {

    final Random random = new Random();

    int getRandomInt() {
        return random.nextInt(9) + 1;
    }

    @Override
    public void start(Stage primaryStage) {

        int length = 3;

        GridPane root = new GridPane();

        for (int y = 0; y < length; y++) {
            for (int x = 0; x < length; x++) {

                TextField textField = new TextField();
                textField.setPrefHeight(50);
                textField.setPrefWidth(50);
                textField.setAlignment(Pos.CENTER);
                textField.setEditable(false);
                textField.setText(getRandomInt() + "");

                root.setRowIndex(textField, y);
                root.setColumnIndex(textField, x);
                root.getChildren().add(textField);
            }
        }

        Scene scene = new Scene(root, 150, 150);
        primaryStage.setTitle("3X3 Matrix");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}