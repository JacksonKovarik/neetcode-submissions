class Solution:
    def search(self, nums: List[int], target: int) -> int:
        initval = -1

        for i in range(len(nums)):
            if i == 0:
                initval = nums[i]
            if nums[i] == target:
                return i
        
        return -1