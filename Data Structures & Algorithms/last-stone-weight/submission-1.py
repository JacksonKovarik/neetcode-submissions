class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        maxHeap = [-val for val in stones]

        heapq.heapify(maxHeap)

        while len(maxHeap) > 1:
            largest = -heapq.heappop(maxHeap)
            largest2 = -heapq.heappop(maxHeap)
            remaining = abs(largest-largest2)

            if remaining > 0:
                heapq.heappush(maxHeap, -remaining)
        
        return -maxHeap[0] if maxHeap else 0
    
    def smash(self, first: int, second: int) -> int:
        return abs(first-second)
        