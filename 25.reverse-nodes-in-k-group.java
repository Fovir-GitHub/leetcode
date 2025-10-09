// @leet imports start
import java.math.*;
import java.util.*;

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

  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || head.next == null || k == 1) {
      return head;
    }

    ListNode dummy = new ListNode(0, head);
    ListNode begin = dummy;
    int i = 0;

    while (head != null) {
      i++;

      if (i % k == 0) {
        begin = reverse(begin, head.next);
        head = begin.next;
      } else {
        head = head.next;
      }
    }

    return dummy.next;
  }

  private static ListNode reverse(ListNode begin, ListNode end) {
    ListNode current = begin.next;
    ListNode previous = begin;
    ListNode backupNext;
    ListNode first = current;

    while (current != end) {
      backupNext = current.next;
      current.next = previous;
      previous = current;
      current = backupNext;
    }

    begin.next = previous;
    first.next = current;

    return first;
  }
}
// @leet end
