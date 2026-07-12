class Node:
    def __init__(self, val):
        self.val = val
        self.next = None
        self.prev = None

class Deque:
    
    def __init__(self):
        self.head = Node(-1)
        self.tail = Node(-1)
        self.head.next = self.tail
        self.tail.prev = self.head

    def isEmpty(self) -> bool:
        return self.head.next == self.tail

    def append(self, value: int) -> None:
        newNode = Node(value)
        lastNode = self.tail.prev

        newNode.prev = self.tail.prev
        newNode.next = self.tail

        lastNode.next = newNode
        self.tail.prev = lastNode.next

    def appendleft(self, value: int) -> None:
        newNode = Node(value)
        firstNode = self.head.next

        newNode.prev = self.head
        newNode.next = firstNode

        firstNode.prev = newNode
        self.head.next = firstNode.prev

    def pop(self) -> int:
        if self.isEmpty():
            return -1

        last = self.tail.prev
        val = last.val

        last.prev.next = self.tail
        self.tail.prev = last.prev

        return val

    def popleft(self) -> int:
        if self.isEmpty():
            return -1

        first = self.head.next
        val = first.val

        first.next.prev = self.head
        self.head.next = first.next

        return val
