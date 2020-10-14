abstract class GeometricObject {

    private String color;
    private Boolean isFilled;
    abstract double getArea();
    abstract double getPerimeter();

    public GeometricObject(String color, Boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.isFilled = filled;
    }

    @Override
    public String toString() {
        return String.format("Area:%.2f\nPerimeter:%.2f\nColor:%s\nIs Filled:%b" , getArea() , getPerimeter() , color , isFilled);
    }
}
