import java.lang.Math;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - (4 * a * c);
    }

    public double getRoot1() {
        if (a == 0) {
            throw new IllegalArgumentException("The value 'a' can not be ZERO");
        } else {

            double discriminant = getDiscriminant();
            if (discriminant < 0)
                return 0;
            else
                return ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public double getRoot2() {
        if (a == 0) {
            throw new IllegalArgumentException("Not a quadratic equation, the value 'a' should not be ZERO");
        } else {

            double discriminant = getDiscriminant();
            if (discriminant < 0)
                return 0;
            else
            return ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

}