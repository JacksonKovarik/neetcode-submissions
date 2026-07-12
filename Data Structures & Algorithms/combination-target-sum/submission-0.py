class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []

        def helper(i, curr, cSum):
            if cSum == target:
                res.append(curr[:])
                return
            if i >= len(nums) or cSum > target:
                return
            
        # I want each number to include itself and all numbers ahead of it
            # This will include itself in the addition
            curr.append(nums[i])
            helper(i,curr,cSum+nums[i])

            curr.pop()
            helper(i+1,curr,cSum)
        
        helper(0,[],0)

        return res