# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def quickSort(self, pairs: List[Pair]) -> List[Pair]:
        self.quickSortHelper(pairs, 0, len(pairs) - 1)
        return pairs

    def quickSortHelper(self, pairs: List[Pair], s: int, e: int) -> None:
        if e-s+1 <= 1:
            return
        
        pivot = pairs[e]

        # get left side (less than pivot)
            # starting at 0, if smaller increment else swap with j
        i = s
        j = s

        while j < e:
            if pairs[j].key < pivot.key:
                temp = pairs[i]
                pairs[i] = pairs[j]
                pairs[j] = temp
                i += 1
            j += 1

        pairs[e] = pairs[i]
        pairs[i] = pivot

        self.quickSortHelper(pairs, s, i-1)
        self.quickSortHelper(pairs,i+1, e)
