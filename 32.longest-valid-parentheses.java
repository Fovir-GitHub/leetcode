// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public int longestValidParentheses(String s) {
    Stack<Integer> st = new Stack<>();
    int longest = 0;
    int i = 0;
    int n = s.length();

    st.push(-1);
    for (; i < n; i++) {
      if (s.charAt(i) == '(') {
        st.push(i);
      } else {
        st.pop();
        if (st.empty()) {
          st.push(i);
        } else {
          longest = Math.max(longest, i - st.peek());
        }
      }
    }

    return longest;
  }
}
// @leet end
