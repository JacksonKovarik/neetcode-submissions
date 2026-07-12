class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        # I want to keep track of 2 sets, the current set and the overall subsets
        currSet, subsets = [], []
        # I want to call the "helper" function starting from the beginning of the list
        self.helper(0, nums, currSet, subsets)
        return subsets



    def helper(self, idx: int, nums: List[int], curr: List[int], sub: List[List[int]]) -> None:
        # Base Case
        if idx >= len(nums):
            sub.append(curr.copy())
            return
        
        # Option 1: Subset with nums[idx] added
        curr.append(nums[idx])
        self.helper(idx+1, nums, curr, sub)
        
        # Option 2: Subset without nums[idx] added
        curr.pop()
        self.helper(idx+1, nums, curr, sub)