class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        perms = [[]]
        for n in nums:
            print(perms)
            newPerms = []
            for p in perms:
                for j in range(len(p)+1): # Here we want to add to every possible position 
                    pCopy = p.copy()
                    pCopy.insert(j,n)
                    if pCopy not in newPerms: newPerms.append(pCopy)
            perms = newPerms
        return perms