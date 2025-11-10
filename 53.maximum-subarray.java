// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    int previous = nums[0];
    int current = 0;
    int maxSum = nums[0];

    for (int i = 1; i < n; i++) {
      current = nums[i] + Math.max(previous, 0);
      maxSum = Math.max(current, maxSum);
      previous = current;
    }

    return maxSum;
  }
}
// @leet end
