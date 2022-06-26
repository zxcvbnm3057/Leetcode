#
# @lc app=leetcode.cn id=1 lang=python3
#
# [1] 两数之和
#

# @lc code=start
class Solution:
    def twoSum(self, nums, target):
        maxi = max(nums)
        mini = min(nums)
        n = len(nums)
        for i in range(n):
            if nums[i] + maxi < target or nums[i] + mini > target:
                continue
            i2=int(n/2)
            while i!=i2:
                if nums[i]+nums[i2]==target:
                    return [i, i2]
                elif nums[i] + nums[i2] > target:
                    i2=i2-int(i2/2)
                elif nums[i]+nums[i2]<target:
                    i2=i2+int(i2/2)
# @lc code=end

a = Solution()
a.twoSum([3, 2, 4], 6)
