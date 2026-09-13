class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int result = 0;

        // Top view
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    result++;
                }
            }
        }

        // Front view: maximum of each row
        for (int i = 0; i < n; i++) {
            int maxRow = 0;

            for (int j = 0; j < n; j++) {
                maxRow = Math.max(maxRow, grid[i][j]);
            }

            result += maxRow;
        }

        // Side view: maximum of each column
        for (int j = 0; j < n; j++) {
            int maxCol = 0;

            for (int i = 0; i < n; i++) {
                maxCol = Math.max(maxCol, grid[i][j]);
            }

            result += maxCol;
        }

        return result;
    }
}
