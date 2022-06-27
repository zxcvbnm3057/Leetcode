/*
 * @Author: Fengying
 * @Date: 2022-06-27 17:18:41
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-27 17:46:24
 */
/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
// @lc code=end
