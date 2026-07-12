# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # iterate through the linked list, keeping track of the previous.
        # When changing the 'next' value, maintain a temp variable for the old next
        # point next to prev and move head to next

        prev = None

        while head:
            nxt = head.next
            head.next = prev
            prev = head
            head = nxt
        
        return prev