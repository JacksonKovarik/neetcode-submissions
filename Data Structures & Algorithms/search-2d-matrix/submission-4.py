class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if target > matrix[-1][-1] or target < matrix[0][0]:
            return False
        
        l = 0
        r = len(matrix[0]) * len(matrix) - 1

        while l <= r:
            m = (r+l) // 2 # 5

            val = matrix[m // len(matrix[0])][m % len(matrix[0])]
            if val == target:
                return True
            elif val < target:
                l = m+1
            else:
                r = m-1
        
        return False