/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
     * 递归算法
     * public List<Integer> inorderTraversal(TreeNode root) {
     * List<Integer> result = new ArrayList<Integer>();
     * if (root != null) {
     * doTraversal(root, result);
     * }
     * return result;
     * }
     * 
     * private void doTraversal(TreeNode node, List<Integer> result) {
     * if (node.left != null) {
     * doTraversal(node.left, result);
     * }
     * result.add(node.val);
     * if (node.right != null) {
     * doTraversal(node.right, result);
     * }
     * }
     */

    // 迭代算法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            result.add(root.val);
            root = root.right;
        }

        return result;
    }
}
// @lc code=end
