import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the Following data to create a triangle:-\n");

            System.out.println("Triangle sides lengths\nSide 1: ");

            double side1 = scanner.nextDouble();

            System.out.println("Side 2: ");

            double side2 = scanner.nextDouble();

            System.out.println("Side 3: ");

            double side3 = scanner.nextDouble();

            System.out.println("Color: ");

            scanner.nextLine(); //Clear the buffer

            String color = scanner.nextLine(); //Color name could contains more than one word

            System.out.println("is filled:\n(Enter 'true' if Yes, 'false' if No)");

            Boolean isFilled = scanner.nextBoolean();

            scanner.close();

            GeometricObject triangle = new Triangle(color, isFilled, side1, side2, side3);

            System.out.printf("\nTriangle Data: \n%s", triangle);

        } catch (InputMismatchException e) {
            System.out.println("Error: Wrong input!");
        } catch (IllegalTriangleException e) {
            System.out.printf(e.getMessage());
        } catch (Exception e) {
            System.out.printf("UnExpected Error, details:\n%s", e);
        }


    }

}
