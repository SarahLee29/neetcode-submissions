# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head.next:
            p1 = head
            p2 = head.next
            while p2:
                res = 0
               
                res= math.gcd(p1.val, p2.val)

                newNode = ListNode(res)
                p1.next = newNode
                newNode.next = p2
                p1 = p1.next.next
                p2 = p2.next
        return head
  

        