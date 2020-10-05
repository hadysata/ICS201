package Labs.Lab05.src;

public class HourlyEmployee extends Staff {

    public HourlyEmployee(String name, String phone, double payPerHour , double hours) {
        super(name, phone, payPerHour * hours);
    }

}
