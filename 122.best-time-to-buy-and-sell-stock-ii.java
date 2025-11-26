// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public int maxProfit(int[] prices) {
    final int n = prices.length;
    int result = 0;
    int buy, sell;
    int i = 0;

    while (i < n - 1) {
      while (i < n - 1 && prices[i] >= prices[i + 1]) {
        i++;
      }
      buy = prices[i];

      while (i < n - 1 && prices[i] < prices[i + 1]) {
        i++;
      }
      sell = prices[i];

      result += sell - buy;
    }

    return result;
  }
}
// @leet end
