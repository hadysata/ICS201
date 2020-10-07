import java.io.*;
import java.util.Scanner;

public class Lab08 {

    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("input.txt");

        Scanner inScanner = new Scanner(in);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        PrintStream printStream = new PrintStream(fileOutputStream);

        String firstName = null, lastName = null;

        while (inScanner.hasNextLine()) {

            if (inScanner.hasNext())
                firstName = inScanner.next();
            else
                inScanner.nextLine();

            if (inScanner.hasNext())
                lastName = inScanner.next();
            else
                inScanner.nextLine();

            printStream.printf("%s %s %n", firstName, lastName);

        }

        inScanner.close();
        printStream.close();
        fileOutputStream.close();
    }
}
