#include <algorithm>
#include <vector>
using namespace std;

// @leet start
class Solution {
public:
    vector<vector<int>> fourSum(vector<int> & nums, int target) {
        vector<vector<int>> result;

        sort(nums.begin(), nums.end());

        int n = (int)nums.size();
        for (int a = 0; a < n - 3; a++) {
            for (int b = a + 1; b < n - 2; b++) {
                int c = b + 1;
                int d = n - 1;

                while (c < d) {
                    long long sum =
                        (long long)nums[a] + nums[b] + nums[c] + nums[d];

                    if (sum == target) {
                        result.push_back({nums[a], nums[b], nums[c], nums[d]});
                        c++;
                        d--;
                        while (nums[c] == nums[c - 1] && c < d) {
                            c++;
                        }
                        while (nums[d] == nums[d + 1] && c < d) {
                            d--;
                        }
                    } else if (sum < target) {
                        c++;
                    } else {
                        d--;
                    }
                }

                while (b + 1 < n && nums[b] == nums[b + 1]) {
                    b++;
                }
            }

            while (a + 1 < n && nums[a] == nums[a + 1]) {
                a++;
            }
        }

        return result;
    }
};
// @leet end
