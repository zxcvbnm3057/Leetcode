'''
Author: Fengying
Date: 2019-12-25 06:40:04
LastEditors: Fengying
LastEditTime: 2022-06-26 13:55:29
'''
#
# @lc app=leetcode.cn id=1 lang=python3
#
# [1] 两数之和
#

# @lc code=start
class Solution:
    def twoSum(self, nums, target):
        for i in range(len(nums) - 1):
            for j in range(len(nums) - 1-i):
                if nums[i]+nums[j+i+1]==target:
                    return i,j+i+1
# @lc code=end

a = Solution()
a.twoSum([3, 2, 4], 6)
