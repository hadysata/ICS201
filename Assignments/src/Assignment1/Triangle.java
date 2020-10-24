public class Triangle extends GeometricObject {

    private double side1, side2, side3;

    public Triangle() {
        this.side1 = 1;
        this.side2 = side1;
        this.side3 = side1;
    }


    public Triangle(String color, Boolean isFilled, double side1, double side2, double side3) throws IllegalTriangleException {
        super(color, isFilled);

        if (isLegalTriangle(side1, side2, side3)) {

            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalTriangleException();
        }

    }

    static Boolean isLegalTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double perimeter = getPerimeter();
        double s = (perimeter) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return String.format("%s \nArea: %.2f\nPerimeter: %.2f", super.toString(), getArea(), getPerimeter());
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}