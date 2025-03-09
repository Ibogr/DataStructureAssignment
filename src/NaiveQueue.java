public class NaiveQueue {
    private String[] arr; // Array to store queue elements
    private int head = 0; // Points to the front of the queue
    private int tail = 0; // Points to the next available position for enqueue

    // Constructor to initialize the queue with a given size
    public NaiveQueue(int size) {
        arr = new String[size];
    }

    // Method to add an element to the queue
    public void enqueue(String value) {
        if (this.isFull()) {
            System.out.println("Queue is full");
        } else {
            arr[tail] = value; // Insert the value at the tail position
            tail++; // Move the tail forward
        }
    }

    // Method to remove an element from the queue
    public String dequeue() {
        if (this.isEmpty()) {
            return "There is no value to pop";
        } else {
            String temp = arr[0]; // Store the first element to return later

            // Shift all elements to the left to maintain queue order
            for (int i = 0; i < tail - 1; i++) {
                arr[i] = arr[i + 1];
            }
            tail = tail - 1; // Reduce the size of the queue
            return temp; // Return the dequeued element
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return tail == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return tail == arr.length;
    }

    // Method to display all elements in the queue
    public void displayList() {
        for (int i = head; i < tail; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line
    }
}
