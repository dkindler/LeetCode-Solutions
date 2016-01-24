// https://leetcode.com/problems/reverse-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode prev = null;
        ListNode nextNode = null;
        while (head.next != null) {
            nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        head.next = prev;

        return head;
    }
}
