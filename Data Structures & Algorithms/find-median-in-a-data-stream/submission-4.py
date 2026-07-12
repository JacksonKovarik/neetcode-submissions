class MedianFinder:

    def __init__(self):
        self.small = [0]
        self.large = [0]

    def addNum(self, num: int) -> None:
        # Max Heap insert
        def insertSmall(val: int):
            self.small.append(val) # Add element to last position
            idx = len(self.small)-1 
            parent = idx//2 # find parent element
            # Continue checking value with parent 
            while self.small[parent] < val and parent > 0:
                self.small[parent], self.small[idx] = self.small[idx], self.small[parent]
                idx = parent
                parent = parent//2

        # Min Heap insert
        def insertLarge(val: int):
            self.large.append(val)
            idx = len(self.large)-1
            parent = idx//2
            while self.large[parent] > val and parent > 0:
                self.large[parent], self.large[idx] = self.large[idx], self.large[parent]
                idx = parent
                parent = parent//2
            
        def popSmall(ls: List[int]) -> int:
            val = ls[1]
            ls[1] = ls.pop()
            lc = 2
            while lc < len(ls):
                gc = lc
                if lc+1 < len(ls): 
                    gc = lc+1 if ls[lc+1] > ls[lc] else lc
                if ls[gc] > ls[gc//2]:
                    ls[gc], ls[gc//2] = ls[gc//2], ls[gc]
                else: break
                lc = gc*2
            return val
        def popLarge(ls: List[int]) -> int:
            val = ls[1]
            ls[1] = ls.pop()
            lc = 2
            while lc < len(ls):
                gc = lc
                if lc+1 < len(ls): 
                    gc = lc+1 if ls[lc+1] < ls[lc] else lc
                if ls[gc] < ls[gc//2]:
                    ls[gc], ls[gc//2] = ls[gc//2], ls[gc]
                else: break
                lc = gc*2
            return val

        def balance():
            if len(self.small)-len(self.large) >= 2: insertLarge(popSmall(self.small))
            elif len(self.large)-len(self.small) >= 2: insertSmall(popLarge(self.large))
        
        insertSmall(num)

        if len(self.small) > 1 and len(self.large) > 1 and self.small[1] > self.large[1]: 
            val = popSmall(self.small)
            insertLarge(val)
        
        balance()

    def findMedian(self) -> float:
        if len(self.small) <= 1: return 0.0
        elif len(self.large) <= 1: return self.small[1]
        elif ((len(self.small) + len(self.large)) % 2 == 0): return (self.small[1]+self.large[1])/2
        else:
            if len(self.small) > len(self.large): return self.small[1]
            else: return self.large[1]
        