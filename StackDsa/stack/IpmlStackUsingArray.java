
class MyStack {

          int[] arr;
          int top;
          int capacity;

          // Constructor
          MyStack(int size) {
                    capacity = size;
                    arr = new int[capacity];
                    top = -1;
          }

          // Push operation //O(1)
          public void push(int data) {
                    if (isFull()) {
                              System.out.println("Stack is full");
                    } else {
                              arr[++top] = data;
                    }
          }

          // Pop operation //O(1)
          public int pop() {
                    if (isEmpty()) {
                              System.out.println("Stack is empty");
                              return -1;
                    } else {
                              return arr[top--];
                    }
          }

          // Peek operation  //O(1)
          public int peek() {
                    if (isEmpty()) {
                              System.out.println("Stack is empty");
                              return -1;
                    }
                    return arr[top];
          }

          // Check if empty  //O(1)
          public boolean isEmpty() {
                    return top == -1;
          }

          // Check if full //O(1)
          public boolean isFull() {
                    return top == capacity - 1;
          }
}

public class IpmlStackUsingArray {

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());   // 30
        System.out.println("Top Element: " + stack.peek()); // 20
    }
}      
