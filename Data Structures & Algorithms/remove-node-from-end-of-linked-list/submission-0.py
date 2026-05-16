# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        pre = ListNode(0)
        pre.next = head
       
        temp = head
     
        temp_pre = pre

        number = 0
        while temp:
            temp = temp.next
            number += 1
        m = number - n + 1
  
        while m > 1:
            temp_pre = temp_pre.next
            m -= 1

        temp_pre.next = temp_pre.next.next
     
        return pre.next



        