class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr = 0
        currMax = nums[0]

        for i in nums:
            if curr < 0:
                curr = 0
            curr += i
            currMax = max(curr, currMax)
        

        return currMax