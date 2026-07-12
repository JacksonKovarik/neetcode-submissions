class Solution:
    def canJump(self, nums: List[int]) -> bool:
        jumps = []
        nums.reverse()

        needed = 0
        for i in range(1, len(nums)):
            needed += 1
            if nums[i] >= needed:
                needed = 0

        return needed == 0
                