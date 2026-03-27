
class DelNode {
    public void deleteNode(ListNode node) {
         // Copy next node's value into current node
       node.val = node.next.val; //T.C - 0(n)

       // Skip the next node
       node.next = node.next.next;  //S.C-O(n)
    }
}