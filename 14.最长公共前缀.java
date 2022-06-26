/*
 * @Author: Fengying
 * @Date: 2022-06-26 14:35:00
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-26 16:36:26
 */
/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < 200; i++) {
            if (!aa(i, strs)) {
                return strs[0].substring(0, i);
            }
        }
        return "";
    }

    private boolean aa(int i, String[] strs) {
        char c = '\0';
        for (String str : strs) {
            if (i >= str.length())
                return false;
            if (c == '\0') {
                c = str.charAt(i);
            } else if (c != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end