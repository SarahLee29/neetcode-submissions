/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode newHead = head;
        ListNode newHeadNext = head.next;
        while (newHeadNext != null) {
            ListNode temp = newHead;
            newHead = newHeadNext;
            newHeadNext = newHeadNext.next;
            if (temp == head) {
                temp.next = null;
            }
            newHead.next = temp;
        }
        return newHead;
          
    }
}
