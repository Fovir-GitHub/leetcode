// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {

  public int divide(long dividend, long divisor) {
    if (dividend == 1 << 31 && divisor == -1) {
      return (1 << 31) - 1;
    } else if (dividend == -(1 << 31) && divisor == 1) {
      return -(1 << 31);
    }

    long a = Math.abs(dividend);
    long b = Math.abs(divisor);
    boolean isNegative = !(dividend < 0 == divisor < 0);

    int result = 0;

    for (int i = 31; i >= 0; i--) {
      if ((a >> i) - b >= 0) {
        result += (1 << i);
        a -= (b << i);
      }
    }

    return isNegative ? -result : result;
  }
}
// @leet end
