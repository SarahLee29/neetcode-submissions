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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
				return list2;
			}
			if (list2 == null) {
				return list1;
			}
        ListNode newHead = (list1.val<=list2.val)?list1:list2;

        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode prev1 = new ListNode(0,null);

        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                prev1 = curr1;
                curr1 = curr1.next;
                continue;
            }
            ListNode temp = curr2;
            curr2 = curr2.next;

            prev1.next = temp;
            temp.next = curr1;
            prev1 = temp;

        }
        if (curr2!=null) {
            prev1.next = curr2;
        }
        return newHead;
        
    }
}
