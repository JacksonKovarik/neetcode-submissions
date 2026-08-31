class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currSum, maxSum = 0,nums[0]
        for right in range(len(nums)):
            if currSum < 0:
                currSum = 0
            currSum += nums[right]
            maxSum = max(currSum, maxSum)

        
        return maxSum