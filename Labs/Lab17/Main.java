package Lab17;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class Main extends Application {

    ImageView imageView[] = new ImageView[3];
    public int CurrentImageIndex = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Lab17");
        System.out.println("Loading images...");

        for (int i = 0; i < imageView.length; i++) {

            System.out.print("Image #" + (i + 1));

            imageView[i] = new ImageView("https://raw.githubusercontent.com/hadysata/ICS201/master/Labs/pics/" + (i + 1) + ".jpg");

            imageView[i].setFitHeight(550);
            imageView[i].setFitWidth(500);
            imageView[i].setPreserveRatio(true);

            System.out.println(" : Done");

        }

        StackPane stack = new StackPane();
        stack.getChildren().add(imageView[0]);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(stack);
        Scene scene = new Scene(borderPane, 700, 500);
        primaryStage.setScene(scene);

        EventHandler<ActionEvent> eventHandler = e -> {
            stack.getChildren().clear();
            stack.getChildren().add(imageView[imageReference()]);
        };

        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(2000), eventHandler));

        //To run without stopping
        animation.setCycleCount(-1);

        animation.play();

        stack.setOnMouseClicked(e -> {
            if (animation.getStatus() == Animation.Status.PAUSED) {
                animation.play();
            } else {
                animation.pause();
            }
        });

        primaryStage.show();
    }

     int imageReference() {
        if (this.CurrentImageIndex + 1 > imageView.length - 1) {
            CurrentImageIndex = 0;
        } else {
            CurrentImageIndex += 1;
        }

        return CurrentImageIndex;
    }


    public static void main(String[] args) {
        launch(args);
    }
}