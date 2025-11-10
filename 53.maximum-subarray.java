// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    int dp[] = new int[n];
    dp[0] = nums[0];
    int maxSum = nums[0];

    for (int i = 1; i < n; i++) {
      dp[i] = nums[i] + Math.max(dp[i - 1], 0);
      maxSum = Math.max(maxSum, dp[i]);
    }

    return maxSum;
  }
}
// @leet end
