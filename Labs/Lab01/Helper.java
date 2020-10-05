package Labs.Lab01;

import java.util.Scanner;

public class Helper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0, c = 0;

        System.out.println("Please enter the values for ");

        try {
            System.out.print("a : ");
            a = scanner.nextDouble();
            System.out.print("b : ");
            b = scanner.nextDouble();
            System.out.print("c : ");
            c = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Please enter a correct value of type DOUBLE");
            System.exit(0);
        }

        scanner.close();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double discriminant = quadraticEquation.getDiscriminant();

        try {

            if (discriminant > 0) {
                double root1 = quadraticEquation.getRoot1();
                double root2 = quadraticEquation.getRoot2();

                System.out.printf("The roots of the quadratic equation with a = %.2f, b = %.2f and c = %.2f are:\n", a,
                        b, c);
                System.out.printf("Root 1 = %.2f\n", root1);
                System.out.printf("Root 2 = %.2f\n", root2);
            } else if (discriminant == 0) {
                double root = quadraticEquation.getRoot1();

                System.out.printf("The one root of the quadratic equation with a = %.2f, b = %.2f and c = %.2f is:\n",
                        a, b, c);
                System.out.printf("Root = %.2f\n", root);
            } else {
                System.out.println("The equation has no roots.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }

}
