// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public int longestValidParentheses(String s) {
    int[] dp = new int[s.length()];
    int result = 0;
    int leftCounter = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        leftCounter++;
      } else if (leftCounter > 0) {
        dp[i] = dp[i - 1] + 2;
        dp[i] += (i - dp[i] >= 0) ? dp[i - dp[i]] : 0;
        result = Math.max(result, dp[i]);
        leftCounter--;
      }
    }

    return result;
  }
}
// @leet end
