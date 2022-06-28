/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
// class Solution0 {
//     public int searchInsert(int[] nums, int target) {
//         double i = 0, j = nums.length - 1, k;
//         while (true) {
//             k = (i + j) / 2;
//             if (j - i <= 1) {
//                 return (int) Math.ceil(j);
//             } else if (nums[(int) Math.ceil(k)] >= target) {
//                 j = k;
//             } else if (nums[(int) Math.ceil(k)] <= target) {
//                 i = k;
//             }
//         }
//     }
// }
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[j] >= target) {
                j = (i + j) >> 1 + i - 1;
            } else {
                i = (i + j) >> 1 + i + 1;
            }
        }
        return j;
    }
}
// @lc code=end

// class Test {
// public static void main(String[] args) {
// System.out.println(new Solution().searchInsert(new int[] { 1, 3, 5, 6 }, 7));
// }
// }