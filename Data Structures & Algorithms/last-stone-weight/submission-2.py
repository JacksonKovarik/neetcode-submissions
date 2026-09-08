class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        maxHeap = []

        for num in stones:
            heapq.heappush(maxHeap, -num)

        while len(maxHeap) >= 2:
            remaining = heapq.heappop(maxHeap) - heapq.heappop(maxHeap)
            if remaining < 0: heapq.heappush(maxHeap, remaining)
        
        if maxHeap: return maxHeap[0]*-1
        return 0