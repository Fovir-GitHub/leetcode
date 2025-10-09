// @leet imports start
import java.math.*;
import java.util.*;
import jdk.internal.classfile.components.ClassPrinter.ListNode;

// @leet imports end

// @leet start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
  // public class ListNode {
  //   int val;
  //   ListNode next;
  //
  //   ListNode() {}
  //
  //   ListNode(int val) {
  //     this.val = val;
  //   }
  //
  //   ListNode(int val, ListNode next) {
  //     this.val = val;
  //     this.next = next;
  //   }
  // }

  public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0, head);
    ListNode current = dummy;

    while (current != null && current.next != null && current.next.next != null) {
      ListNode previous = current.next;
      ListNode last = current.next.next;
      ListNode backupNext = last.next;

      current.next = last;
      last.next = previous;
      previous.next = backupNext;
      current = current.next.next;
    }

    return dummy.next;
  }
}
// @leet end
