package Labs.Lab03.src;

public class Queue {

    private int[] elements;
    private int size;

    public Queue() {
        this.elements = new int[8];
    }

    void enqueue(int v) {

        if (size >= elements.length) {
            int[] tempArray = elements.clone();
            elements = new int[tempArray.length * 2];

            for (int i = 0; i < tempArray.length; i++) {
                elements[i] = tempArray[i];
            }

        }

        elements[size] = v;

        size++;
    }

    int dequeue() {

        int firstElement = elements[0];

        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;

        return firstElement;
    }

    boolean empty() {
        if (size > 0)
            return false;
        else
            return true;
    }

    int getSize() {
        return size;
    }

}
