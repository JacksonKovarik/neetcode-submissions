# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        curr = head
        iteration = 0
        while curr and curr.next:
            node = self.pop(curr)
            self.insert(curr, node)

            curr = curr.next.next
    
    def pop(self, head) -> Optional[ListNode]:
        curr = head;
        prev = None
        while curr.next:
            prev = curr
            curr = curr.next
        
        if prev: prev.next = None
        return curr
    
    def insert(self, head, node):
        node.next = head.next
        head.next = node