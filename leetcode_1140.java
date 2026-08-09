class Solution {

    int[][] dp;
    int[] suffix;
    int n;

    public int stoneGameII(int[] piles) {

        n = piles.length;

        // suffix[i] = total stones from i to n-1
        suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        dp = new int[n][n + 1];

        return solve(piles, 0, 1);
    }

    private int solve(int[] piles, int i, int M) {

        // All piles have been taken
        if (i >= n) {
            return 0;
        }

        // Already calculated
        if (dp[i][M] != 0) {
            return dp[i][M];
        }

        int best = 0;

        // Current player can take 1 to 2*M piles
        for (int X = 1; X <= 2 * M && i + X <= n; X++) {

            int newM = Math.max(M, X);

            // Stones opponent will get after we take X piles
            int opponent = solve(piles, i + X, newM);

            // Total stones remaining from i
            int totalRemaining = suffix[i];

            // Stones current player gets
            int current = totalRemaining - opponent;

            best = Math.max(best, current);
        }

        dp[i][M] = best;

        return best;
    }
}
