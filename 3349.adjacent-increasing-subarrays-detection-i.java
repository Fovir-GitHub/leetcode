// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
    int left = 0, right = k * 2;

    while (right <= nums.size()) {
      if (isIncreasingArray(nums, left, right, k)) {
        return true;
      }
      left++;
      right++;
    }

    return false;
  }

  private boolean isIncreasingArray(List<Integer> nums, int left, int right, int k) {
    for (int i = left + 1; i < left + k; i++) {
      if (nums.get(i - 1) >= nums.get(i)) {
        return false;
      }
    }

    for (int i = left + k + 1; i < right; i++) {
      if (nums.get(i - 1) >= nums.get(i)) {
        return false;
      }
    }

    return true;
  }
}
// @leet end
