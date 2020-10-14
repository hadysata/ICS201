public class Triangle extends GeometricObject {

    private double side1, side2, side3;


    public Triangle(String color, Boolean isFilled, double side1, double side2, double side3) {
        super(color, isFilled);

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    double getArea() {
        double perimeter = getPerimeter();
        double s = (perimeter) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }


}
