// A linked list node
class Node {
    int data;  // integer data
    Node next; // pointer to the next node

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;  // reference to the top of the stack

    // Constructor to initialize the stack
    public Stack() {
        this.top = null;
    }

    // Utility function to add an element `x` in the stack
    public void push(int x) {
        // Create a new node with the given data
        Node newNode = new Node(x);

        // Set the next of the new node to the current top
        newNode.next = top;

        // Update the top to point to the new node
        top = newNode;
        System.out.println(x + " pushed to stack");
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        // The stack is empty if the top is null
        return top == null;
    }

    // Utility function to return the top element in the stack
    public int peek() {
        // If the stack is empty, return -1
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        // Return the top element
        return top.data;
    }
    // Utility function to pop the top element from the stack and check for Stack underflow
    public void pop() {
        // If the stack is empty, print an error message
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        // Print the top element being popped
        System.out.println("Popped element is " + top.data);

        // Move the top pointer to the next node (i.e., remove the top node)
        top = top.next;
    }
}
public class Task_2 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);  // Push 1
        stack.push(2);  // Push 2
        stack.push(3);  // Push 3

        System.out.println("Top element is " + stack.peek());  // Peek the top element

        stack.pop();  // Pop the top element
        stack.pop();  // Pop the next top element
        stack.pop();  // Pop the last element

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            System.out.print("Stack is not empty");
        }
    }
}
