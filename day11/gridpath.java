package day11;

public class gridpath {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 1},{1, 5, 1},{4, 2, 1}};
        int rows = 3;
        int cols = 3;
        int[][] dp = new int[rows][cols];
        dp[0][0] = arr[0][0];
        // First row
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + arr[0][j];
        }
        // First column
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }
        // Remaining cells
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = arr[i][j]+Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        System.out.println("Minimum Path Sum = " + dp[rows - 1][cols - 1]);
    }
}