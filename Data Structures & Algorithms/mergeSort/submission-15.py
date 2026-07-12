# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def mergeSort(self, pairs: List[Pair]) -> List[Pair]:
        return self.mergeHelper(pairs, 0, len(pairs)-1)
    # Create a function to partition the array until only 1 element
    def mergeHelper(self, pairs: List[Pair], s: int, e: int) -> List[Pair]:
        if e-s+1 <= 1:
            return pairs

        m = (e+s) // 2

        self.mergeHelper(pairs, s, m)
        self.mergeHelper(pairs, m+1, e)

        self.merge(pairs, s, m, e)

        return pairs
    
    # Create Left subarray and Right subarray
    def merge(self, pairs: List[Pair], s: int, m: int, e: int) -> List[Pair]:
        left = pairs[s:m+1]
        right = pairs[m+1:e+1]

        l, r, p = 0, 0, s

        while l < len(left) and r < len(right):
            if left[l].key <= right[r].key:
                pairs[p] = left[l]
                l += 1
            else:
                pairs[p] = right[r]
                r += 1
            p += 1
        
        while l < len(left):
            pairs[p] = left[l]
            l += 1
            p += 1

        while r < len(right):
            pairs[p] = right[r]
            r += 1
            p += 1

        return pairs
