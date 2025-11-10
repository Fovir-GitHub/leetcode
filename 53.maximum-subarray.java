// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public int maxSubArray(int[] nums) {
    int currentMax = 0;
    int tillNowMax = Integer.MIN_VALUE;

    for (int num : nums) {
      currentMax = Math.max(currentMax + num, num);
      tillNowMax = Math.max(currentMax, tillNowMax);
    }

    return tillNowMax;
  }
}
// @leet end
