package Lab16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;


public class Main extends Application {

    int CurrentImageIndex = 0;
    final ImageView imageView[] = new ImageView[3];

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Lab16");

        System.out.println("Loading images...");

        for (int i = 0; i < 3; i++) {

            System.out.print("Image #" + (i + 1));

            imageView[i] = new ImageView("https://raw.githubusercontent.com/hadysata/ICS201/master/Labs/pics/" + (i + 1) + ".jpg");

            imageView[i].setFitHeight(550);
            imageView[i].setFitWidth(550);
            imageView[i].setPreserveRatio(true);

            System.out.println(" : Done");
        }

        Button previousButton = new Button("Previous");
        previousButton.setAlignment(Pos.BOTTOM_LEFT);

        Button nextButton = new Button("Next");
        nextButton.setAlignment(Pos.BOTTOM_RIGHT);


        HBox hBox = new HBox(35);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(previousButton, nextButton);

        StackPane stack = new StackPane();
        stack.getChildren().add(imageView[0]);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);

        borderPane.setCenter(stack);

        Scene scene = new Scene(borderPane, 700, 500);

        primaryStage.setScene(scene);

        previousButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stack.getChildren().clear();
                stack.getChildren().add(imageView[previousImageIndex()]);
            }
        });

        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stack.getChildren().clear();
                stack.getChildren().add(imageView[nextImageIndex()]);
            }
        });

        primaryStage.show();
    }

    public int nextImageIndex() {
        if (this.CurrentImageIndex + 1 > imageView.length - 1) {
            CurrentImageIndex = 0;
            return CurrentImageIndex;
        } else
            return ++CurrentImageIndex;
    }

    public int previousImageIndex() {
        if (this.CurrentImageIndex - 1 < 0) {
            CurrentImageIndex = imageView.length - 1;
            return CurrentImageIndex;
        } else
            return --CurrentImageIndex;
    }


    public static void main(String[] args) {
        launch(args);
    }
}