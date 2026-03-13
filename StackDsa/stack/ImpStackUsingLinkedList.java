
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack {  //space 0(n)

          Node top;
          int size;

          // Constructor
          MyStack() {
                    top = null;
                    size = 0;
          }

          // Push operation O(1)
          public void push(int data) {
                    Node newNode = new Node(data);
                    newNode.next = top;
                    top = newNode;
                    size++;
          }

          // Pop operation O(1)
          public int pop() {
                    if (isEmpty()) {
                              System.out.println("Stack Underflow");
                              return -1;
                    }
                    int popped = top.data;
                    top = top.next;
                    size--;
                    return popped;
          }

          // Peek operation O(1)
          public int peek() {
                    if (isEmpty()) {
                              System.out.println("Stack is empty");
                              return -1;
                    }
                    return top.data;
          }

          // Check if stack is empty O(1)
          public boolean isEmpty() {
                    return top == null;
          }

          // Get current stack size O(1)
          public int getSize() {
                    return size;
          }

          // Print stack O(1)
          public void printStack() {
                    Node curr = top;
                    System.out.print("Stack: ");
                    while (curr != null) {
                              System.out.print(curr.data + " ");
                              curr = curr.next;
                    }
                    System.out.println("\nCurrent size: " + size);
          }
}



public class ImpStackUsingLinkedList {

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack(); // Stack: 30 20 10 + size

        System.out.println("Top: " + stack.peek());   // 30
        System.out.println("Popped: " + stack.pop()); // 30

        stack.printStack(); // Stack: 20 10 + size
        System.out.println("Current size: " + stack.getSize()); // 2
    }
}      
