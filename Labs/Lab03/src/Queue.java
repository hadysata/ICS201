public class Queue {

    private int[] elements;
    private int size;

    public Queue() {
        this.elements = new int[8];
    }

    void enqueue(int v) {

        if (size >= elements.length) {
            // array size will be doubled once the number of the elements exceeds the size

            int[] tempElements = elements.clone();
            elements = new int[tempElements.length * 2];

            for (int i = 0; i < tempElements.length; i++) {
                elements[i] = tempElements[i];
            }
        }

        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int[] tempElements = elements.clone();
        elements = new int[tempElements.length]; // Clear the elements array

        for (int i = 0; i < tempElements.length - 1; i++) {
            elements[i] = tempElements[i + 1];
        }

        size--;

        return tempElements[0];
    }

    public boolean empty() {
        if (size <= 0)
            return true;
        else
            return false;
    }

    public int getSize() {
        return this.size;
    }

}
