/*
 * @Author: Fengying
 * @Date: 2022-06-26 14:12:54
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-26 14:34:22
 */

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        if (s.length() == 1)
            return map.get(s.charAt(0));

        int i1, i2, sum = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            i1 = map.get(s.charAt(i - 1));
            i2 = map.get(s.charAt(i));
            if (i1 >= i2) {
                sum = sum + i2;
            } else {
                sum = sum + i2 - i1;
                i--;
            }
            if (i == 1) {
                sum += map.get(s.charAt(i - 1));
            }
        }
        return sum;
    }
}
// @lc code=end
