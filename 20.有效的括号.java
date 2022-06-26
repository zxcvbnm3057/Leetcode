/*
 * @Author: Fengying
 * @Date: 2022-06-26 16:41:05
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-26 17:19:58
 */

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    private int i = 0;

    public boolean isValid(String s) {
        return isValid(s, '\0');
    }

    private boolean isValid(String s, char c) {
        while (i < s.length()) {
            char b = s.charAt(i);
            switch (b) {
                case '(':
                case '[':
                case '{':
                    i++;
                    if (!isValid(s, b))
                        return false;
                    break;
                case ')':
                    i++;
                    return c == '(';
                case ']':
                    i++;
                    return c == '[';
                case '}':
                    i++;
                    return c == '{';
            }
        }
        return c == '\0';
    }
}
// @lc code=end