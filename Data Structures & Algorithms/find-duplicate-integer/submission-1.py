class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            if nums[i]-1 == i:
                continue
            elif nums[i] == nums[nums[i]-1]:
                return nums[i]
            else:
                tmp = nums[nums[i]-1]
                nums[nums[i]-1] = nums[i]
                nums[i] = tmp
        
        return -1