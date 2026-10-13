# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        finalNum = l1.val + l2.val
        curr1 = l1.next
        curr2 = l2.next

        mult = 10
        while curr1:
            finalNum += curr1.val*mult
            mult *= 10
            curr1 = curr1.next

        mult = 10
        while curr2:
            finalNum += curr2.val*mult
            mult *= 10
            curr2 = curr2.next
        
        # finalNum = number1 + number2

        newNode = ListNode()
        curr = newNode
        while True:
            curr.next = ListNode(finalNum%10)
            finalNum = finalNum // 10
            if finalNum == 0: break
            curr = curr.next

        return newNode.next
        
