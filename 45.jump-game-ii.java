// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public int jump(int[] nums) {
    final int n = nums.length;
    int[] steps = new int[n];

    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= nums[i]; j++) {
        int current = i + j;
        if (current >= n) {
          continue;
        }
        steps[current] =
            steps[current] == 0 ? steps[i] + 1 : Math.min(steps[current], steps[i] + 1);
        if (steps[n - 1] != 0) {
          return steps[n - 1];
        }
      }
    }

    return steps[n - 1];
  }
}
// @leet end
