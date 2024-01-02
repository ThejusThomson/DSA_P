package Leet;

public class CloudMigration {

    // Function to find the minimum cost to rent cores for a given number of days
    public static int minCost(int n, int k, int[][] plans) {
        int[][] dp = new int[n + 1][k + 1];
        int INF = Integer.MAX_VALUE / 2;

        // Initialize the first row of dp with INF
        for (int j = 1; j <= k; j++) {
            dp[0][j] = INF;
        }

        // Iterate through each day
        for (int i = 1; i <= n; i++) {
            // Iterate through each possible number of cores
            for (int j = 1; j <= k; j++) {
                // Initialize the minimum cost for the current combination to be INF
                dp[i][j] = INF;

                // Iterate through each available plan
                for (int[] plan : plans) {
                    int l = plan[0], r = plan[1], c = plan[2], p = plan[3];

                    if (i >= l && i <= r && j >= c) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - c] + p);
                    }
                }

                // If the minimum cost is still INF, set it to the previous day's cost
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
            }
        }

        int minCost = INF;

        // Find the minimum cost from the last row for each possible number of cores
        for (int j = 1; j <= k; j++) {
            minCost = Math.min(minCost, dp[n][j]);
        }

        // Return the minimum cost, or -1 if no valid plan is found
        return minCost == INF ? -1 : minCost;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 7;
        int[][] plans = {
                {1, 3, 5, 2},
                {1, 4, 5, 3},
                {2, 5, 10, 1}
        };

        int result = minCost(n, k, plans);
        System.out.println("Minimum cost: " + result);
    }
}


