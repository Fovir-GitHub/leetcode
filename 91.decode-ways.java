// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public int numDecodings(String s) {
    if (s.equals("0") || s.contains("00") || s.charAt(0) == '0') {
      return 0;
    }

    int n = s.length();
    int dp[] = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      int single = Integer.valueOf(s.substring(i - 1, i));
      int twoDigit = Integer.valueOf(s.substring(i - 2, i));
      if (single != 0) {
        dp[i] += dp[i - 1];
      }
      if (twoDigit >= 10 && twoDigit <= 26) {
        dp[i] += dp[i - 2];
      }
    }

    return dp[n];
  }
}
// @leet end
