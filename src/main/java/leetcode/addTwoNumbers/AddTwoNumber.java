package leetcode.addTwoNumbers;

import java.util.LinkedList;
import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String l1Str = String.valueOf(l1.next.next.val) + String.valueOf(l1.next.val) + String.valueOf(l1.val);
        String l2Str = String.valueOf(l2.next.next.val) + String.valueOf(l2.next.val) + String.valueOf(l2.val);

        int sumInt = Integer.parseInt(l1Str) + Integer.parseInt(l2Str);
        String sum = String.valueOf(sumInt);

        int val = Integer.parseInt(String.valueOf(sum.charAt(2)));
        ListNode result = new ListNode(val);
        val = Integer.parseInt(String.valueOf(sum.charAt(1)));
        result.next = new ListNode(val);
        val = Integer.parseInt(String.valueOf(sum.charAt(0)));
        result.next.next = new ListNode(val);

        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = new AddTwoNumber().addTwoNumbers(l1, l2);

        System.out.println(String.valueOf(result.val) + String.valueOf(result.next.val) + String.valueOf(result.next.next.val));
    }
}
