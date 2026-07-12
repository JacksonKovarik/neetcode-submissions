class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.heap = [0]

        for i in nums:
            self.add(i)
            # print(self.heap)

    def add(self, val: int) -> int:
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
                
        if len(self.heap) > self.k+1:
            self.pop()
        

        return self.heap[1]

    def pop(self) -> int:
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


