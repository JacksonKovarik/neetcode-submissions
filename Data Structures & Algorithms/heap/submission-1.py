class MinHeap:
    
    def __init__(self):
        self.heap = [0]

    def push(self, val: int) -> None:
        self.heap.append(val)
        i = len(self.heap)-1

        while i > 1:
            parent = self.heap[i // 2]
            if parent > self.heap[i]:
                self.heap[i // 2] = self.heap[i]
                self.heap[i] = parent
                i = i // 2
            else:
                break        

    def pop(self) -> int:
        if len(self.heap) <= 1:
            return -1
        if len(self.heap) == 2:
            return self.heap.pop()
        mini = self.heap[1]

        self.heap[1] = self.heap.pop()

        i = 1

        while i < len(self.heap):
            minChild = None
            if len(self.heap) > i*2+1:
                if self.heap[i*2] <= self.heap[i*2 + 1]:
                    minChild = i*2
                else:
                    minChild = i*2 + 1
            elif len(self.heap) > i*2:
                minChild = i*2
            else:
                break


            if self.heap[minChild] < self.heap[i]:
                tmp = self.heap[minChild]
                self.heap[minChild] = self.heap[i]
                self.heap[i] = tmp
                i = minChild
            else:
                break
            
        return mini
        

    def top(self) -> int:
        return self.heap[1] if len(self.heap) > 1 else -1

    def heapify(self, nums: List[int]) -> None:
        for i in nums:
            self.push(i)