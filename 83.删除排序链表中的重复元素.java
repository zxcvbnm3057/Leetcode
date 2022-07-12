/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            head.next = getNextNode(head.next, head.val);
        }
        return head;
    }

    private ListNode getNextNode(ListNode node, int curr) {
        if (node != null) {
            if (node.val != curr) {
                node.next = getNextNode(node.next, node.val);
                return node;
            }
            return getNextNode(node.next, curr);
        }
        return null;
    }

}
// @lc code=end
