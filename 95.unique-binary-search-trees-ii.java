// @leet imports start
import java.math.*;
import java.util.*;

// @leet imports end
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

// @leet start
class Solution {
  public List<TreeNode> generateTrees(int n) {
    return generateSubtrees(1, n);
  }

  private List<TreeNode> generateSubtrees(int start, int end) {
    List<TreeNode> result = new ArrayList<TreeNode>();
    if (start > end) {
      result.add(null);
      return result;
    }

    for (int i = start; i <= end; i++) {
      List<TreeNode> left = generateSubtrees(start, i - 1);
      List<TreeNode> right = generateSubtrees(i + 1, end);

      for (TreeNode leftNode : left) {
        for (TreeNode rightNode : right) {
          TreeNode temp = new TreeNode(i);
          temp.left = leftNode;
          temp.right = rightNode;
          result.add(temp);
        }
      }
    }

    return result;
  }
}
// @leet end
