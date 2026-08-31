# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        head = ListNode()
        curr = head
        leftCurr = list1
        rightCurr = list2

        while leftCurr and rightCurr:
            if leftCurr.val <= rightCurr.val:
                curr.next = ListNode(leftCurr.val)
                leftCurr = leftCurr.next
            else:
                curr.next = ListNode(rightCurr.val)
                rightCurr = rightCurr.next

            curr = curr.next
        
        if leftCurr: curr.next = leftCurr
        else: curr.next = rightCurr

        return head.next
