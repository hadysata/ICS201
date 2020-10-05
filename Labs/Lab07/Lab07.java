import java.util.InputMismatchException;
import java.util.Scanner;

class Lab07 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Integer userInput = null;

        final String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        final int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (userInput == null) {
            try {

                System.out.println("enter an integer between 1 and 12 to display the month and its number of days: ");

                userInput = kb.nextInt() - 1;

                System.out.printf("Month Number: %d \nMonth Name: %s \nMonth days: %d", userInput + 1, months[userInput], dom[userInput]);

                kb.close();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong number.");
                userInput = null;
                kb.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("You should only enter an integer");
                userInput = null;
                kb.nextLine();
            }


        }
    }

}