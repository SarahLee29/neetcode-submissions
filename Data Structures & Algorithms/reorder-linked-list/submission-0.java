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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            nodes.add(cur);
            cur = cur.next;
        }
        int p1 = 0;
        int p2 = nodes.size() - 1;
        while (p1 < p2){
            nodes.get(p1).next = nodes.get(p2);
            nodes.get(p2).next = nodes.get(p1+1);
            p1++;
            p2--;
        }
        nodes.get(p1).next = null;
    }
}
