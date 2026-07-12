class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        subsets = []

        def dfs(i,curr):
            if i >= len(nums):
                subsets.append(curr[:])
                return
            curr.append(nums[i])
            dfs(i+1,curr)
            
            curr.pop()
            dfs(i+1,curr)
        
        dfs(0,[])
        return subsets