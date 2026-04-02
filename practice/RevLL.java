public class RevLL {
          public ListNode reverseList(ListNode head) { // T.C - O(n)
                    ListNode prev = null; // points to previous node
                    ListNode curr = head; // points to current node

                    while (curr != null) {
                              ListNode temp = curr.next; // store next node;
                              curr.next = prev; // reverse link - this is the main step
                              prev = curr; // move prev forward
                              curr = temp; // move curr forward
                    }
                    return prev;
          }   
}
