// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int n = obstacleGrid[0].length;
    int dp[] = new int[n];
    dp[0] = 1;

    for (int[] row : obstacleGrid) {
      for (int i = 0; i < n; i++) {
        if (row[i] == 1) {
          dp[i] = 0;
        } else if (i > 0) {
          dp[i] += dp[i - 1];
        }
      }
    }

    return dp[n - 1];
  }
}
// @leet end
