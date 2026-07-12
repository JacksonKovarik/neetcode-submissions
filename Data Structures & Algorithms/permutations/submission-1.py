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
        perms = [[]]
        for n in nums:
            newPerms = []
            for p in perms:
                for j in range(len(p)+1): # Here we want to add to every possible position
                    pCopy = p.copy()
                    pCopy.insert(j,n)
                    newPerms.append(pCopy)
            perms = newPerms
        return perms
                    
        # return helper(0,[])