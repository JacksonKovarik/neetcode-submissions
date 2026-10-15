class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        seen = set()

        for i in nums:
            if i > 0:
                seen.add(i)
        
        lowestMissing = 1

        while True:
            if lowestMissing not in seen:
                return lowestMissing
            lowestMissing += 1
                