public class CircularQueue {

    private String[] arr; // Array to store queue elements
    private int head = 0; // Points to the front (dequeue position)
    private int tail = 0; // Points to the next available spot (enqueue position)

    public CircularQueue(int size) {
        arr = new String[size]; // Initialize the queue with given size
    }

    // Check if the queue is full
    public boolean isFull() {
        return (head == tail + 1 || (head == 0 && tail == arr.length - 1));
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return head == tail;
    }

    // Add an element to the queue
    public void enqueue(String value) {
        if (isFull()) {
            System.out.println("CircularQueue is full.");
        } else {
            arr[tail] = value; // Insert value at tail position
            tail = (tail == arr.length - 1) ? 0 : tail + 1; // Move tail forward
        }
    }

    // Remove an element from the queue
    public String dequeue() {
        if (isEmpty()) {
            return "Queue is empty. No value to pop.";
        } else {
            String temp = arr[head]; // Get the front value
            head = (head == arr.length - 1) ? 0 : head + 1; // Move head forward
            return temp; // Return dequeued value
        }
    }

    // Display all elements in the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            if (head < tail) {
                // Print normally if head is before tail
                for (int i = head; i < tail; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                // Print in two parts if the queue wraps around
                for (int i = head; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
                for (int i = 0; i < tail; i++) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
