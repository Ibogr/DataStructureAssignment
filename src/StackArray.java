public class StackArray {
    private String[] arr; // Array to store stack elements
    private int top = 0;  // Index of the top element

    // Constructor to initialize stack with given size
    public StackArray(int max_size) {
        this.arr = new String[max_size];
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == arr.length;
    }

    // Push a new value onto the stack
    public void push(String value) {
        if (!this.isFull()) { // If stack is not full
            arr[top] = value;  // Add value at top position
            top++;             // Move top up
        } else {
            System.out.println("Stack is full, you can't add: " + value);
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == 0;
    }

    // Pop (remove) the top element from the stack
    public String pop() {
        if (this.isEmpty()) { // If stack is empty
            return "Stack is empty. Cannot pop.";
        } else {
            String popElement = arr[top - 1]; // Get top element
            arr[top - 1] = null; // Remove element from stack
            top--; // Decrease top index
            return popElement; // Return popped element
        }
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack contents: ");
        for (int i = 0; i < top; i++) {
            if (arr[i] != null) {
                System.out.print(arr[i] + " "); // Print each element
            }
        }
        System.out.println();
    }

    // Peek at the top element without removing it
    public String peep() {
        if (this.isEmpty()) {
            return "Stack is empty. Nothing to peek.";
        } else {
            return arr[top - 1]; // Return top element
        }
    }

    // Get the current size of the stack
    public int size() {
        return top; // Number of elements in stack
    }
}
