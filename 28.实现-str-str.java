/*
 * @Author: Fengying
 * @Date: 2022-06-27 17:48:40
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-27 18:01:48
 */
/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == "")
            return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (strContains(haystack, needle, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean strContains(String haystack, String needle, int i) {
        if (haystack.charAt(i) == needle.charAt(0)) {
            for (int j = 1; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
// @lc code=end
