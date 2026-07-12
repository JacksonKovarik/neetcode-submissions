class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        minCount = 0
        l,r = 0, 0
        currSum = 0
        while r < len(nums):
            currSum += nums[r]
            while currSum >= target and l <= r:
                minCount = (r-l+1) if minCount == 0 else min(minCount, (r-l+1))  
                currSum -= nums[l]
                l += 1
            r += 1
        
        return minCount