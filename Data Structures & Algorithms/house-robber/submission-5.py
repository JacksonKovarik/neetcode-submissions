class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        if len(nums) == 1:
            return nums[0]

        a = []
        a.append(nums[0])
        a.append(max(nums[0], nums[1]))

        for i in range(2,len(nums)):
            amt = nums[i] + a[i-2]
            a.append(max(amt, a[i-1]))
        
        return max(a[-1], a[-2])