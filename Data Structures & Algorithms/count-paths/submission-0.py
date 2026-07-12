class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        grid = [[0 for _ in range(n)] for _ in range(m)] 
        
        for k in range(n):
            grid[0][k] = 1
        for k in range(m):
            grid[k][0] = 1
            
        for i in range(1,m):
            for j in range(1,n):
                grid[i][j] = grid[i-1][j] + grid[i][j-1]

        return grid[-1][-1]

    def printGrid(self, grid, col, row):
        for i in range(col):
            print(grid[i])