// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end

// @leet start
class Solution {
  public List<Integer> findSubstring(String s, String[] words) {
    HashMap<String, Integer> originalCount = new HashMap<>();
    List<Integer> result = new ArrayList<>();

    if (words.length == 0 || s.length() == 0) {
      return result;
    }

    int wordSize = words[0].length();
    int wordCount = words.length;
    int N = s.length();

    for (String word : words) {
      originalCount.put(word, originalCount.getOrDefault(word, 0) + 1);
    }

    for (int offset = 0; offset < wordSize; offset++) {
      HashMap<String, Integer> currentCount = new HashMap<>();
      int start = offset;
      int count = 0;
      for (int end = start; end + wordSize <= N; end += wordSize) {
        String currentWord = s.substring(end, end + wordSize);

        if (originalCount.containsKey(currentWord)) {
          currentCount.put(currentWord, currentCount.getOrDefault(currentWord, 0) + 1);
          count++;

          while (currentCount.get(currentWord) > originalCount.get(currentWord)) {
            String startWord = s.substring(start, start + wordSize);
            currentCount.put(startWord, currentCount.get(startWord) - 1);
            start += wordSize;
            count--;
          }

          if (count == wordCount) {
            result.add(start);
          }
        } else {
          count = 0;
          start = end + wordSize;
          currentCount.clear();
        }
      }
    }

    return result;
  }
}
// @leet end
