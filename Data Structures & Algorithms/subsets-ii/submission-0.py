class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        # Sort the nums list for easier operations (won't effect time comp)
        nums.sort()
        currSet, subsets = [], []
        self.helper(0,nums,currSet,subsets)
        return subsets
    
    def helper(self, idx, nums, currSet, subsets):
        if idx >= len(nums):
            subsets.append(currSet.copy())
            return
        
        # Option 1: Add nums[idx] to subset
        currSet.append(nums[idx])
        self.helper(idx+1, nums, currSet, subsets)

        # Option 2: Do not add nums[idx] to subset
        currSet.pop()
        # Will exclude all duplicates from the current path
        while (idx+1) < len(nums) and nums[idx] == nums[idx+1]:
            idx += 1
        self.helper(idx+1, nums, currSet, subsets)