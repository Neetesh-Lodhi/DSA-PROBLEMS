class MiddleLL{
           public ListNode middleNode(ListNode head) {
        ListNode slow = head; //T.C-O(n)
        ListNode fast = head; //S.C-O(1)

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; //fast moves with 2 steps
        }
        return slow;
    }
}