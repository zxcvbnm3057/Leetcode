import java.util.Deque;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    /*
     * 递归
     * public boolean isSymmetric(TreeNode root) {
     * return isSymmetric(root.left, root.right);
     * }
     * 
     * private boolean isSymmetric(TreeNode left, TreeNode right) {
     * return ((left != null && right != null) && left.val == right.val &&
     * isSymmetric(left.left, right.right)
     * && isSymmetric(left.right, right.left)) || left == right;
     * }
     */

    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> std = new LinkedList<>();
        std.push(root);
        std.push(root);

        TreeNode left, right;

        while (!std.isEmpty()) {
            left = std.pop();
            right = std.pop();
            if (left == null && right == null) {
                continue;
            } else if (left == null || right == null || left.val != right.val) {
                return false;
            }
            std.push(left.left);
            std.push(right.right);

            std.push(left.right);
            std.push(right.left);
        }
        return true;
    }
}
// @lc code=end
