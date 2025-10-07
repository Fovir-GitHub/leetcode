#include <algorithm>
#include <climits>
#include <cstdlib>
#include <vector>
using namespace std;

// @leet start
class Solution {
public:
    int threeSumClosest(vector<int> & nums, int target) {
        sort(nums.begin(), nums.end());

        int result = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.size() - 2; i++) {
            int j = i + 1;
            int k = (int)nums.size() - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (abs(total - target) < abs(target - result)) {
                    result = total;
                }

                if (total < target) {
                    j++;
                } else if (total > target) {
                    k--;
                } else {
                    return result;
                }
            }
        }

        return result;
    }
};
// @leet end
