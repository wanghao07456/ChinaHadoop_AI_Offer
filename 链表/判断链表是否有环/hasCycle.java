public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (fast.next == null) {
                return false;
            }
            if (fase.next == slow) {
                return true;
            }
        }
        fast = fast.next.next;
        slow = slow.next;       
    }
    return false;
}