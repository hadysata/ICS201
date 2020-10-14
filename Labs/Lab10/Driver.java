import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Please enter the three sides of the triangle, a color, and 'T' to indicate that the triangle is filled, any other letter to indicate that the triangle is NOT filled:");

            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            String color = scanner.next();

            Boolean isFilled = scanner.next().equals("T");

            scanner.close();

            GeometricObject triangle  = new Triangle(color , isFilled , side1 , side2,side3);

            System.out.println(triangle);

        }catch (Exception e){
            System.out.println(e.toString());
        }


    }

}
