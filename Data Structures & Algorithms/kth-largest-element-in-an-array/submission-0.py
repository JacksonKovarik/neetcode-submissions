class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        maxHeap = [-val for val in nums]
        heapq.heapify(maxHeap)

        ans = 0
        while k > 0:
            ans = -heapq.heappop(maxHeap)
            k -= 1
        return ans
