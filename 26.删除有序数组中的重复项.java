/*
 * @Author: Fengying
 * @Date: 2022-06-27 17:08:05
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-27 17:18:53
 */
/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int num = nums[0], j = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != num) {
                num = nums[i];
                nums[j] = num;
                j++;

            }
        }
        return j;
    }
}
// @lc code=end
