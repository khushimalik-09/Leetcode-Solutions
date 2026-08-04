class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode firstptr =dummy;
        ListNode secondptr =dummy;
        for(int i=0;i<n;i++){
            secondptr = secondptr.next;
        }
        while(secondptr.next!=null){
            firstptr = firstptr.next;
            secondptr = secondptr.next;
        }
        firstptr.next = firstptr.next.next;
        return dummy.next;
    }
}