class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        fullPerms = []
        
        perms = [[]]

        for n in nums:
            newPerm = []
            for p in perms:
                for i in range(len(p)+1):
                    pCopy = p.copy()
                    pCopy.insert(i,n)
                    newPerm.append(pCopy)
            perms += newPerm

        for p in perms:
            if len(p) == len(nums):
                fullPerms.append(p)

        return fullPerms
