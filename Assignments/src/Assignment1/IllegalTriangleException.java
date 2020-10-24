public class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
        super("Error: The sum of any two sides in triangle should be greater than the other side.");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
