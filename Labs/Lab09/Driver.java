import java.io.*;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        try {
            File fileInput = new File("times.txt");

            Scanner inScanner = new Scanner(fileInput);

            File fileOutput = new File("result.txt");

            PrintStream printStream = new PrintStream(fileOutput);

            printStream.printf("#\t 24-hour \t 12-hour \n-------------------------------------\n"); //Result file header

            int lines = 0;

            while (inScanner.hasNextLine()) {

                lines++;

                String time = inScanner.nextLine();
                String result = "";

                try {
                    result = get12HourNotation(time);
                } catch (TimeException exception) {
                    result = exception.getMessage();
                }

                printStream.printf("%s \t %s \t %s \n", lines, time, result);

            }

            inScanner.close();
            printStream.close();

            System.out.println("Process has been successfully completed.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


    }


    static boolean isValidTime(String time) {

        time = time.trim(); //Make sure there is no spaces

        if (time.length() == 5 && time.contains(":")) {

            String timeData[] = time.split(":");

            String hours = timeData[0];
            String minutes = timeData[1];

            //Check for hours
            try {
                int intHours = Integer.parseInt(hours);

                if (!(intHours >= 00) || !(intHours < 24)) {
                    return false;
                }

            } catch (Exception e) {
                return false; //not a number
            }

            //Check for minutes
            try {
                int intMinutes = Integer.parseInt(minutes);

                if (!(intMinutes >= 00) || !(intMinutes < 60)) {
                    return false;
                }

            } catch (Exception e) {
                return false; //not a number
            }


        } else {
            return false; //Time length is not 5 or there is no colon
        }

        return true;
    }

    static String get12HourNotation(String time) throws TimeException {

        if (isValidTime(time)) {

            String timeData[] = time.split(":");
            int hours = Integer.parseInt(timeData[0]);
            int minutes = Integer.parseInt(timeData[1]);
            String timeReference = "";


            if (hours >= 12) {
                timeReference = "PM";
            } else {
                timeReference = "AM";
            }

            if (hours == 00) {
                hours = 12;
            } else if (hours > 12) {
                hours -= 12;
            }

            return String.format("%02d:%02d %s", hours, minutes, timeReference);

        } else {
            throw new TimeException();
        }

    }


}
