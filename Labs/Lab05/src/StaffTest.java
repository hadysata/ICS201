package Labs.Lab05.src;

public class StaffTest {

    public static void main(String[] args) {

        Staff[] staffList = new Staff[4];
        double totalPay = 0;

        staffList[0] = new Executive("Ahmad", "860-1490", 5000);
        staffList[1] = new MonthlyEmployee("Ali", "0555-0101", 850);
        staffList[2] = new HourlyEmployee("Othman", "0555-0690", 40, 20.5);
        staffList[3] = new Volunteer("Bandar", "849-8374");

        for (Staff person : staffList) {
            // Give the bonuses
            if (person instanceof Executive) {
                person.giveBonus(5000);
            }

            totalPay += person.getPay();

            System.out.println(person.toString());

        }

        System.out.printf("Total Pay: %.1f SR %n" , totalPay);


    }

}
