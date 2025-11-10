// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public boolean canJump(int[] nums) {
    int currentFarthest = nums[0];
    int n = nums.length;
    if (n <= 1) {
      return true;
    }

    for (int i = 1; i <= currentFarthest; i++) {
      currentFarthest = Math.max(currentFarthest, nums[i] + i);
      if (currentFarthest >= n - 1) {
        return true;
      }
    }

    return currentFarthest >= n;
  }
}
// @leet end
