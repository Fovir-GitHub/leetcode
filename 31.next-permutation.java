// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public void nextPermutation(int[] nums) {
    int n = nums.length;
    int k = 0;
    int l = n - 1;

    for (k = n - 2; k >= 0; k--) {
      if (nums[k] < nums[k + 1]) {
        break;
      }
    }

    if (k < 0) {
      reverse(nums, 0, n - 1);
      return;
    }

    for (l = n - 1; l > k; l--) {
      if (nums[l] > nums[k]) {
        break;
      }
    }

    swap(nums, k, l);
    reverse(nums, k + 1, n - 1);
  }

  private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  private static void reverse(int[] nums, int left, int right) {
    while (left <= right) {
      swap(nums, left, right);
      left++;
      right--;
    }
  }
}
// @leet end
