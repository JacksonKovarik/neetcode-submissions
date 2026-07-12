# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:   
        # Orders [head -> tail -> head.next]
        curr = head
        headPointer = head
        while curr.next and curr.next.next:
            while curr.next.next:
                curr = curr.next
            curr.next.next = headPointer.next
            headPointer.next = curr.next

            headPointer = headPointer.next.next
            curr.next = None
            curr = headPointer


        # Counts Nodes        
        # count = 0
        # while curr:
        #     count += 1
        #     curr = curr.next
        