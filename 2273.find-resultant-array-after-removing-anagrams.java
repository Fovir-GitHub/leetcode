// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public List<String> removeAnagrams(String[] words) {
    List<String> result = new ArrayList<String>();
    int i = 0, j = 1;
    int n = words.length;

    while (i < n - 1 && j < n) {
      while (j < n && isAnagrams(words[i], words[j])) {
        j++;
      }
      result.add(words[i]);
      i = j++;
    }

    if (i == n - 1) {
      result.add(words[i]);
    }

    return result;
  }

  public boolean isAnagrams(String previous, String last) {
    if (previous.length() != last.length()) {
      return false;
    }

    int[] frequency = new int[26];

    for (int i = 0; i < previous.length(); i++) {
      frequency[previous.charAt(i) - 'a']++;
    }

    for (int i = 0; i < last.length(); i++) {
      int index = last.charAt(i) - 'a';
      if (frequency[index] == 0) {
        return false;
      }
      frequency[index]--;
    }

    return true;
  }
}
// @leet end
