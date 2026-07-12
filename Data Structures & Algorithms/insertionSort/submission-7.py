# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def insertionSort(self, pairs: List[Pair]) -> List[List[Pair]]:
        if not pairs:
            return pairs;
            
        res = []
        res.append(list(pairs))

        for i in range(1,len(pairs)):
            j = i-1
            k = i
            while pairs[k].key < pairs[j].key and j >= 0:
                temp = pairs[k]
                pairs[k] = pairs[j]
                pairs[j] = temp
                j -= 1
                k -= 1
            res.append(pairs[:])

        return res
            