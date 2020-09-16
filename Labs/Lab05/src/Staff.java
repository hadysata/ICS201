
public class Staff {

    private String name;
    private String phone;
    private double pay;

    public Staff(String name, String phone, double pay) {
        this.name = name;
        this.phone = phone;
        this.pay = pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    void giveBonus(double amount) {
        this.pay += amount;
    }

    public double getPay() {
        return pay;
    }

    // public String getName() {
    // return name;
    // }

    // public String getPhone() {
    // return phone;
    // }

    @Override
    public String toString() {
        return String.format("Staff Type: %s %nName: %s %nPhone: %s %nPay: %.1f %n", this.getClass().getSimpleName(),
                name, phone, pay);
    }

}
