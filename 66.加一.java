/*
 * @Author: Fengying
 * @Date: 2022-06-28 14:35:26
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-28 14:47:55
 */
/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= -1; i--) {
            if (i == -1) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                for (int j = 0; j < digits.length; j++) {
                    result[j + 1] = digits[j];
                }
                return result;
            }
            if (digits[i] != 9) {
                digits[i]++;
                break;
            }
            digits[i] = 0;
        }
        return digits;
    }
}
// @lc code=end
