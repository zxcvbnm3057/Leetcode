/*
 * @Author: Fengying
 * @Date: 2022-06-28 14:48:28
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-28 15:35:46
 */
/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length(), j = b.length(), x, y, carry = 0;
        StringBuilder s = new StringBuilder();
        while (i > 0 && j > 0) {
            x = a.charAt(--i) - '0';
            y = b.charAt(--j) - '0';
            s.append((x + y + carry) % 2);
            carry = (x + y + carry) / 2;
        }
        while (i > 0) {
            x = a.charAt(--i) - '0';
            s.append((x + carry) % 2);
            carry = (x + carry) / 2;
        }
        while (j > 0) {
            y = b.charAt(--j) - '0';
            s.append((y + carry) % 2);
            carry = (y + carry) / 2;
        }
        if (carry > 0) {
            s.append(carry);
        }
        return s.reverse().toString();
    }
}
// @lc code=end