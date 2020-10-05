package Labs.Lab02.src;

public class Helper {

    public static void main(String[] args) {

        MyPoint testPoint1 = new MyPoint();
        MyPoint testPoint2 = new MyPoint(10, 30.5);

        System.out.printf("The distance between (%.2f,%.2f) and (%.2f,%.2f) is %.2f %n", testPoint1.getX(),
                testPoint1.getY(), testPoint2.getX(), testPoint2.getY(), testPoint1.distance(testPoint2));

    }

}
