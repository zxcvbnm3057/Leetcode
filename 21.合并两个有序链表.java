/*
 * @Author: Fengying
 * @Date: 2022-06-27 15:27:03
 * @LastEditors: Fengying
 * @LastEditTime: 2022-06-27 17:07:20
 */
/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 != null && (list1 == null || list1.val > list2.val)) {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        } else if (list1 != null) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        return null;
    }
}
// @lc code=end