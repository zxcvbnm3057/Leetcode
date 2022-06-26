/*
 * @Author: Fengying
 * @Date: 2022-06-26 13:57:15
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-26 14:01:31
 */
/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null; //
    }
}
// @lc code=end
