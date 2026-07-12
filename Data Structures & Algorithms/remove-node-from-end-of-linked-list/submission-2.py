# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return None

        target = 0
        curr = head
        while curr:
            target += 1
            curr = curr.next

        target -= n

        if target == 0:
            head = head.next
            return head
        
        prev = None
        curr = head
        while curr:
            if target == 0:
                prev.next = curr.next
            target -= 1
            prev = curr
            curr = curr.next

        return head