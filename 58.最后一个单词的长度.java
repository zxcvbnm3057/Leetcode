/*
 * @Author: Fengying
 * @Date: 2022-06-28 14:24:03
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-28 14:33:46
 */
/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int j = s.length();
        int i = s.length() - 1;
        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (j - i > 1) {
                    return j - i - 1;
                }
                j = i;
            }
        }
        return j - i - 1;
    }
}
// @lc code=end
