import java.util.*;

public class Driver {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number of cities: ");

            int citiesCount = scanner.nextInt();


            City[] citiesList = new City[citiesCount];

            for (int i = 0; i < citiesCount; i++) {
                citiesList[i] = newCity(i + 1);
            }

            scanner.close();

            Arrays.sort(citiesList);

            for (City city : citiesList) {
                System.out.println(city);
            }


        } catch (Exception e) {
            System.out.println(e);

        }

    }


    static City newCity(int counter) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int temp;

        try {
            System.out.printf("Enter #%d city's name and its temperature: %n", counter);
            name = scanner.next();
            temp = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong inputs!, try again");
            return newCity(counter);
        }

        return new City(name, temp);
    }

}
