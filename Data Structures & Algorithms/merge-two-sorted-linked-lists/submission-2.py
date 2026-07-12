# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        newList = ListNode(-1)
        tail = newList;

        l1 = list1
        l2 = list2
        while l1 and l2:
            if l1.val <= l2.val:
                tail.next = ListNode(l1.val)
                l1 = l1.next
            else:
                tail.next = ListNode(l2.val)
                l2 = l2.next
            tail = tail.next
        
        while l1:
            tail.next = ListNode(l1.val)
            tail = tail.next
            l1 = l1.next

        while l2:
            tail.next = ListNode(l2.val)
            tail = tail.next
            l2 = l2.next


        return newList.next