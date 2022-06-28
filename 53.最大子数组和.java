/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], pre = 0;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            sum = Math.max(sum, pre);
        }
        return sum;
    }
}
// @lc code=end
