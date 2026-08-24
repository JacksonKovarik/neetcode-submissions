class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        flowers_that_can_be_planted = 0
        
        i = 0
        while i < len(flowerbed):
            if flowerbed[i] == 0:
                if i == len(flowerbed)-1 or flowerbed[i + 1] == 0:
                    flowers_that_can_be_planted += 1
                    i += 1
            else:
                i += 1

            i += 1
        
        return flowers_that_can_be_planted >= n