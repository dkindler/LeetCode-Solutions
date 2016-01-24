//https://leetcode.com/problems/add-two-numbers/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = l1;
        int rem = 0;

        while (l1 != null && l2 != null) {
            l1.val += (l2.val + rem);

            if (l1.val >= 10) {
                rem = 1;
                l1.val %= 10;
            } else {
                rem = 0;
            }

            if (l1.next == null && l2.next != null) {
                l1.next = new ListNode(0);
            } else if (l1.next != null && l2.next == null) {
                l2.next = new ListNode(0);
            } else if (l1.next == null && l2.next == null) {
                if (rem != 0) l1.next = new ListNode(rem);
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        return head;
    }
}
