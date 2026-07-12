class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        if len(cost) == 0:
            return 0
        if len(cost) == 1:
            return cost[0]
        
        a = []
        a.append(cost[0])
        a.append(cost[1])

        for i in range(2, len(cost)):
            amt1 = cost[i] + a[i-1]
            amt2 = cost[i] + a[i-2]
            a.append(min(amt1, amt2))
        
        return min(a[-1], a[-2])