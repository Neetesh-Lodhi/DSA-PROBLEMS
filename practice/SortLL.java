class SortLL{
           public ListNode sortList(ListNode head) {
       if(head == null || head.next == null) return head;  //t.c-logn*(n+n/2)

       ListNode middle = findMiddle(head);
       ListNode leftHead = head;
       ListNode rightHead = middle.next;
       middle.next = null; //separate into two lists

       leftHead = sortList(leftHead);
       rightHead = sortList(rightHead);

       return mergeTwoLists(leftHead,rightHead); 

    }



     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(1); //T.C-0(m+n)
        ListNode merge = dummy;

        while(list1 != null && list2 != null){
               if(list1.val <= list2.val){
                merge.next = list1;
                list1 = list1.next;
               } else {
                merge.next = list2;
                list2 = list2.next;
               }
               merge = merge.next;
        }

        if(list1!=null) {
            merge.next = list1;
        }
        if(list2!=null){
            merge.next = list2;
        }
        return dummy.next;
    }


     public ListNode findMiddle(ListNode head) {
        ListNode slow = head; //T.C-O(n)
        ListNode fast = head.next; //S.C-O(1) head.next because finding correct middle 

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; //fast moves with 2 steps
        }
        return slow;
    }
}