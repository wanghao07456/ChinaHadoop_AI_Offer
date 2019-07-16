class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;        
        //将fast先走，与slow的距离保证为n
        for (int i=1; i<=n+1; i++) {
            fast = fast.next;
        }        
        //将fast走到头，然后slow走到中间，两者的距离正好还是n
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }        
        //删除目标节点
        slow.next = slow.next.next;
        return start.next;        
    }
}