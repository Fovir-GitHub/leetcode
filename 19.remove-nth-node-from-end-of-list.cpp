struct ListNode {
    int val;
    ListNode * next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode * next) : val(x), next(next) {}
};

// @leet start

class Solution {
private:
    int totalNode = 0;
    bool deleteRoot = false;

public:
    ListNode * removeNthFromEnd(ListNode * currentNode, int n, int current = 1,
                                bool isRoot = true) {
        if (!currentNode->next) {
            totalNode = current;
            if (totalNode == n) {
                deleteRoot = true;
            }
            return nullptr;
        }

        removeNthFromEnd(currentNode->next, n, current + 1, false);

        if (!deleteRoot && current == totalNode - n) {
            currentNode->next =
                (currentNode->next ? currentNode->next->next : nullptr);
        }

        if (deleteRoot && isRoot) {
            return currentNode->next;
        }

        return currentNode;
    }
};
// @leet end
