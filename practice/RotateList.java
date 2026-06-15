class RotateList{
            public ListNode rotateRight(ListNode head, int k) {
        // Edge case: if list is empty or single node or k=0, no rotation needed
        if (head == null || head.next == null || k == 0) return head;

        ListNode tail = head;  //t.c-O(2n)
        int len = 1;

        while(tail.next !=null){
            tail = tail.next;
            len++;
        }

        if(k % len == 0) return head;

        k = k % len;

        //attach the tail to head

        tail.next = head; // 1st step complete , last node start pointing first

        ListNode newLastNode = findNthNode(head,len-k);

        head = newLastNode.next;
        newLastNode.next = null; // after rotation last Node points to null

        return head;

    }

    public ListNode findNthNode(ListNode temp,int k){
        int count = 1;

        while(temp != null){
            if(count == k) return temp;
            count++;
            temp = temp.next;

        }

        return temp;
    }
}