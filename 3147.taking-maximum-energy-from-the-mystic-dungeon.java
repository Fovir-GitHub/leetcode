// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  // public static void main(String[] args) {
  //   int[] energy = {1, 2, 3};
  //   maximumEnergy(energy, 1);
  // }

  public int maximumEnergy(int[] energy, int k) {
    int n = energy.length;
    int[] dp = new int[n];
    int result = Integer.MIN_VALUE;

    for (int i = n - 1; i >= 0; i--) {
      dp[i] = energy[i] + (i + k < n ? dp[i + k] : 0);
      result = Math.max(result, dp[i]);
    }

    return result;
  }
}
// @leet end
