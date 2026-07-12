class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        def helper(i,curr):
            if i == len(nums):
                return [[]]
            
            res = []
            perms = helper(i+1,curr)
            for p in perms:
                for j in range(len(p)+1):
                    pCopy = p.copy()
                    pCopy.insert(j,nums[i])
                    res.append(pCopy)
            return res
        
        return helper(0,[])