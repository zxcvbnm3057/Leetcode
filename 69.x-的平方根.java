/*
 * @Author: Fengying
 * @Date: 2022-06-28 15:38:00
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-28 17:01:00
 */
/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根 
 */

// @lc code=start
// class Solution {
//     public int mySqrt(int x) {
//         for (int i = 0; i <= 65536; i++) {
//             if ((double) i * i > x) {
//                 return i - 1;
//             }
//         }
//         return 0;
//     }
// }
class Solution {
    public int mySqrt(int x) {
        int i = 0, j = x, mid;
        // if (x < 2) {
        // return x;
        // }
        while (j >= i) {
            mid = (j + i) >> 1;
            if ((double) mid * mid > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i - 1;
    }
}
// @lc code=end