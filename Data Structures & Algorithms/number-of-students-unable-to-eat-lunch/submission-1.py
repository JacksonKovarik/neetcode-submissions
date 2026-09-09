class Node:
    def __init__(self, val):
        self.val = val
        self.next = None
        self.prev = None

class LinkedList:
    def __init__(self, head):
        self.head = head
        self.tail = self.head
        self.size = 1
    
    def popHead(self) -> Node:
        node = self.head
        self.head = self.head.next
        if self.head:
            self.head.prev = None
        self.size -= 1

        return node
    
    def pushTail(self, node):
        self.tail.next = node
        self.tail.next.prev = self.tail
        self.tail = self.tail.next
        self.size += 1
    
    def peek(self):
        return self.head.val
    
    def printList(self):
        curr = self.head
        while curr:
            print(curr.val)
            curr = curr.next

class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        ls = LinkedList(Node(students[0]))
        sandPtr = 0
        count1 = 0
        count0 = 0
        if ls.peek() == 1: count1 += 1
        else: count0 += 1

        for i in range(1, len(students)):
            if students[i]==1: count1 += 1 
            else: count0 += 1

            ls.pushTail(Node(students[i]))

        while ls.size > 0:
            if (sandwiches[sandPtr] == 0 and count0 == 0) or (sandwiches[sandPtr] == 1 and count1 == 0):
                break
            elif ls.peek() != sandwiches[sandPtr]:
                ls.pushTail(ls.popHead())
            else:
                if sandwiches[sandPtr] == 0: 
                    count0 -= 1
                else:
                    count1 -= 1
                ls.popHead()
                sandPtr += 1

        return ls.size
