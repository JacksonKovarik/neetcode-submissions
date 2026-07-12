class Solution {
    public int countPaths(int[][] grid) {
        return this.dfs(grid, 0, 0, new HashSet<>());
    }

    public int dfs(int[][] grid, int r, int c, Set<List<Integer>> visited) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        // Base Cases
        if(r == ROWS 
                || c == COLS 
                || r < 0 
                || c < 0 
                || grid[r][c] == 1
                || visited.contains(Arrays.asList(r,c))) {

            return 0;
        }
        // If the end is reached
        if(r == ROWS-1 && c == COLS-1) {
            return 1;
        }

        visited.add(Arrays.asList(r,c));

        int count = 0;
        // Up
        count += this.dfs(grid, r-1, c, visited);
        // Down
        count += this.dfs(grid, r+1, c, visited);
        // Left
        count += this.dfs(grid, r, c-1, visited);
        // Right
        count += this.dfs(grid, r, c+1, visited);

        visited.remove(Arrays.asList(r,c));
        return count;
    }
}
