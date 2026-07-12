class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        grid = [[0 for _ in range(len(text2)+1)] for _ in range(len(text1)+1)]
        
        for i in range( len(text1)):
            for j in range( len(text2)):
                if text1[i] == text2[j]:
                    grid[i+1][j+1] = 1+grid[i][j]
                else:
                    grid[i+1][j+1] = max(grid[i+1][j], grid[i][j+1])
        
        print(grid)
        return grid[-1][-1]