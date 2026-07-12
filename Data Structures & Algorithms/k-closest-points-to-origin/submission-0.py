class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        if not points:
            return points

        minHeap = []
        lis = []

        for i in range(len(points)):
            x = points[i][0]
            y = points[i][1]
            dist = math.sqrt((x ** 2) + (y ** 2))
            minHeap.append([dist, x, y])

        heapq.heapify(minHeap)

        while k > 0:
            dist, x, y = heapq.heappop(minHeap)
            lis.append([x,y])
            k -= 1
        
        return lis