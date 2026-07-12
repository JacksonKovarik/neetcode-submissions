class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        res = []
        def helper(i,curr, cSum):
            if cSum == target: 
                res.append(curr[:])
                return
            if i >= len(candidates) or cSum > target:
                return
            
            curr.append(candidates[i])
            helper(i+1,curr,cSum+candidates[i])
            
            curr.pop()
            while (i+1) < len(candidates) and candidates[i] == candidates[i+1]:
                i += 1
            helper(i+1,curr,cSum)
        
        helper(0,[],0)
        return res