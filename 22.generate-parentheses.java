// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<String>();
    recurse(result, "", 0, 0, n);

    return result;
  }

  public static void recurse(List<String> result, String temp, int open, int close, int n) {
    if (temp.length() == n * 2) {
      result.add(temp);
      return;
    }

    if (open < n) {
      recurse(result, temp + "(", open + 1, close, n);
    }

    if (close < open) {
      recurse(result, temp + ")", open, close + 1, n);
    }
  }
}
// @leet end
