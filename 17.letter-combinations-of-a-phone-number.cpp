#include <string>
#include <unordered_map>
#include <vector>
using namespace std;

// @leet start
class Solution {
private:
    const unordered_map<char, string> NUMBER_LETTER_MAP = {
        {'2', "abc"}, {'3', "def"},  {'4', "ghi"}, {'5', "jkl"},
        {'6', "mno"}, {'7', "pqrs"}, {'8', "tuv"}, {'9', "wxyz"},
    };

public:
    vector<string> letterCombinations(string digits) {
        if (digits.empty()) {
            return {};
        }

        vector<string> result;
        string temp;
        Solve(result, 0, digits, temp);

        return result;
    }

    void Solve(vector<string> & result, int currentIndex, string & digits,
               string & current) {
        if (currentIndex >= digits.size()) {
            result.push_back(current);
            return;
        }

        string currentNumberString = NUMBER_LETTER_MAP.at(digits[currentIndex]);
        for (const char & ch : currentNumberString) {
            current.push_back(ch);
            Solve(result, currentIndex + 1, digits, current);
            current.pop_back();
        }
    }
};
// @leet end
