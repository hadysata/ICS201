import java.lang.Math;

public class MyPoint {

    private double x, y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    double distance(MyPoint point) {
        return distance(point.x, point.y);
    }

    static double distance(MyPoint point1, MyPoint point2) {
        return point1.distance(point2);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
