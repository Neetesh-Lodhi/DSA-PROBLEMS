class RemoveNthNode{
              public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1); //T.C - O(n)
        dummy.next = head; //if we did't know head this is the technique to know head

        ListNode back = dummy;
        ListNode front = dummy;

        for(int i=0;i<n;i++){
            front = front.next;
        }

        while(front.next!=null){
            back = back.next;
            front = front.next;
        }
        back.next = back.next.next;
        return dummy.next;

    }
}