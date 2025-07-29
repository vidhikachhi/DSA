package LinkedList.Scratch;
public class error {
 class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

  public class Solution {

    private ListNode meetingPoint(ListNode head) {
        ListNode slow = head, fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Find the start of the cycle (intersection)
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }

        return null; // No cycle means no intersection
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        // Connect tail of list A to headB temporarily
        ListNode temp = headA;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = headB;

        // Detect intersection (start of cycle)
        ListNode ans = meetingPoint(headA);

        // Restore original list
        temp.next = null;

        return ans;
    }
}

}
