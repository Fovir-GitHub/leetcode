// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public boolean isMatch(String s, String p) {
    int m = s.length();
    int n = p.length();
    boolean[][] dp = new boolean[m + 1][n + 1];
    dp[0][0] = true;

    for (int i = 0; i < n && p.charAt(i) == '*'; i++) {
      dp[0][i + 1] = true;
    }

    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        char sign = p.charAt(j - 1);
        if (sign == '?') {
          dp[i][j] = dp[i - 1][j - 1];
        } else if (sign == '*') {
          dp[i][j] = (dp[i - 1][j] || dp[i - 1][j - 1] || dp[i][j - 1]);
        } else {
          dp[i][j] = dp[i - 1][j - 1] && s.charAt(i - 1) == sign;
        }
      }
    }

    return dp[m][n];
  }
}
// @leet end
