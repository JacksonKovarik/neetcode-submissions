"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if not head:
            return None

            
        newHead = Node(head.val)

        curr = head
        newCurr = newHead

        # Key: Node Value | Value: Node
        myMap = {}
        myMap.setdefault(newCurr.val, newCurr)

        while curr.next:
            newNode = Node(curr.next.val)
            newCurr.next = newNode
            curr = curr.next
            newCurr = newCurr.next

            myMap.setdefault(newCurr.val, newCurr)

        
        newCurr = newHead
        curr = head
        # Go through list again and identify correct randoms
        while curr:
            if curr.random and curr.random.val in myMap:
                newCurr.random = myMap[curr.random.val]
            curr = curr.next
            newCurr = newCurr.next

        return newHead
