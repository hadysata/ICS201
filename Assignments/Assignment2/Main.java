package Assignment2;

import java.io.*;
import java.util.*;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Main extends Application {

    final private String inputFileName = "unsortedStudents.txt";
    final private String outputFileName = "StudentsSortedById.txt";

    final private Button btLoad = new Button("Load");
    final private Button btSort = new Button("Sort");
    final private Button btSave = new Button("Save");

    final private ArrayList<Student> studentsList = new ArrayList<>();
    final private Alert alert = new Alert(AlertType.NONE);

    @Override
    public void start(Stage primaryStage) {

        btLoad.setPrefSize(400, 200);
        btSort.setPrefSize(400, 200);
        btSave.setPrefSize(400, 200);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(3);
        gridPane.setVgap(15);

        gridPane.add(btLoad, 0, 0);
        gridPane.add(btSort, 1, 0);
        gridPane.add(btSave, 2, 0);

        gridPane.setAlignment(Pos.CENTER);

        btLoad.setOnAction((event) -> loadController());

        btSort.setOnAction((event) -> sortController());

        btSave.setOnAction((event) -> saveController());

        Scene scene = new Scene(gridPane, 220, 120);
        primaryStage.setTitle("Students sorting tool");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Controllers
    void loadController() {
        try {

            //Clear the students list (It may contains data if this method called more than one time)
            studentsList.clear();

            Scanner scanner = new Scanner(new File(inputFileName));

            while (scanner.hasNextLine()) {
                int studentId = scanner.nextInt();
                String studentName = scanner.nextLine(); //Student name could contains fist and last name

                Student student = new Student(studentName, studentId);

                studentsList.add(student);
            }

            scanner.close();

            dataLoadedAlert();

        } catch (FileNotFoundException ex) {
            inputFileNotFoundAlert();
        } catch (java.util.NoSuchElementException ex) {
            inputFileFormatAlert();
        } catch (Exception ex) {
            unknownErrorAlert();
        }
    }

    void sortController() {
        if (studentsList.isEmpty()) {
            listIsEmptyAlert();
        } else {
            Collections.sort(studentsList);

            dataSortedAlert();
        }
    }

    void saveController() {
        if (studentsList.isEmpty()) {
            listIsEmptyAlert();
        } else {

            try {
                FileWriter fileWriter = new FileWriter(outputFileName, false);
                PrintWriter printWriter = new PrintWriter(fileWriter);

                for (Student student : studentsList) {
                    printWriter.print(student);
                }

                printWriter.close();
                fileWriter.close();

                dataSavedAlert();

            } catch (IOException ex) {
                inputFileNotFoundAlert();
            } catch (Exception ex) {
                unknownErrorAlert();
            }

        }
    }

    void showAlert(AlertType type, String message) {
        alert.setAlertType(type);
        alert.setContentText(message);
        alert.show();
    }

    //Alerts
    void listIsEmptyAlert() {
        showAlert(AlertType.ERROR, "Students data are empty.");
    }

    void inputFileNotFoundAlert() {
        showAlert(AlertType.ERROR, String.format("'%s' file not found.", inputFileName));
    }

    void dataSavedAlert() {
        showAlert(AlertType.INFORMATION, String.format("Student data has been saved to '%s' successfully.", outputFileName));
    }

    void dataSortedAlert() {
        showAlert(AlertType.INFORMATION, "Student data has been sorted successfully.");
    }

    void dataLoadedAlert() {
        showAlert(AlertType.INFORMATION, "Loading completed.");
    }

    void inputFileFormatAlert() {
        showAlert(AlertType.WARNING, String.format("'%s' file does not follow the correct format:\n[id]\t[name]\n\nThe app may not be able to load all students data", inputFileName));
    }

    void unknownErrorAlert() {
        showAlert(AlertType.ERROR, "Unknown error\nSorry we can't load the data.");
    }


    public static void main(String[] args) {
        launch(args);
    }

}