public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {

                if (grid[row][col] == '1') {
                    count++;

                    dfs(grid, row, col);
                }
            }
        }

        return count;
    }

    private static void dfs(char[][] grid, int row, int col) {

        // Out of bounds
        if (row < 0 || row >= grid.length ||
                col < 0 || col >= grid[row].length) {
            return;
        }

        // Water or already visited
        if (grid[row][col] == '0') {
            return;
        }

        // Mark this land as visited
        grid[row][col] = '0';

        // Go up
        dfs(grid, row - 1, col);

        // Go down
        dfs(grid, row + 1, col);

        // Go left
        dfs(grid, row, col - 1);

        // Go right
        dfs(grid, row, col + 1);
    }
}
