import java.util.*;
import javax.xml.transform.Templates;

public class checkPalindrome {

          // Class representing a single node in the linked list
          public static class Node {
                    int data; // Data stored in the node
                    Node next; // Reference to the next node in the linked list

                    // Constructor to initialize the node with a data value
                    public Node(int data) {
                              this.data = data;
                              this.next = null; // Initially, next is set to null (no next node)
                    }
          }

          // Head and tail references for the linked list
          public static Node head; // Points to the first node in the list
          public static Node tail; // Points to the last node in the list

          // Function to find the middle node of the linked list
          public static Node findMid(Node head) {
                    Node slow = head; // Slow pointer moves one step at a time
                    Node fast = head; // Fast pointer moves two steps at a time

                    // Loop until fast reaches the end of the list or its next node is null
                    while (fast != null && fast.next != null) {
                              slow = slow.next; // Move slow pointer one step
                              fast = fast.next.next; // Move fast pointer two steps
                    }
                    return slow; // Slow will point to the middle node when fast reaches the end
          }

          // Function to check if the linked list is a palindrome
          public  boolean isPalindrom() {
                    // Edge case: if the list is empty or has only one node, it's a palindrome
                    if (head == null || head.next == null) {
                              return true;
                    }

                    // Step 1: Find the middle node of the list
                    Node midNode = findMid(head);

                    // Step 2: Reverse the second half of the list starting from the middle
                    Node prev = null; // To keep track of the previous node during reversal
                    Node curr = midNode; // Start reversing from the middle node
                    Node temp;

                    // Reverse the second half of the linked list
                    while (curr != null) {
                              temp = curr.next; // Store reference to the next node
                              curr.next = prev; // Reverse the current node's pointer
                              prev = curr; // Move prev to current node
                              curr = temp; // Move to the next node in the original list
                    }

                    // Step 3: Compare the first half with the reversed second half
                    Node right = prev; // Pointer to the head of the reversed second half
                    Node left = head; // Pointer to the head of the original list

                    // Traverse both halves and compare corresponding nodes
                    while (right != null) {
                              // If data doesn't match, it's not a palindrome
                              if (left.data != right.data) {
                                        return false;
                              }
                              left = left.next; // Move to the next node in the first half
                              right = right.next; // Move to the next node in the second half
                    }

                    // If all nodes matched, the list is a palindrome
                    return true;
          }

          public void addFirst(int data) { // O(1)

                    // step1-create new node
                    Node newNode = new Node(data);
                    
                    if (head == null) {
                              head = tail = newNode;
                              return;
                    }

                    // step2-newNode next=head
                    newNode.next = head;
                    // step3-head=newNode
                    head = newNode;
          }

          public void addLast(int data) { // O(1)
                    // step1-create newNode
                    Node newNode = new Node(data);
                    

                    if (head == null) {

                              head = tail = newNode;
                              return;
                    }
                    // step2-
                    tail.next = newNode;

                    // step3-
                    tail = newNode;
          }

          // Main function to run the code
          public static void main(String[] args) {
                    checkPalindrome ll = new checkPalindrome(); // Create a new linked list

                    ll.addFirst(1);
                    ll.addFirst(2);
                    ll.addFirst(2);
                    ll.addFirst(1);

                    if (ll.isPalindrom()) {
                              System.out.println("The linked list is a palindrome.");
                    } else {
                              System.out.println("The linked list is not a palindrome.");
                    }
          }
}