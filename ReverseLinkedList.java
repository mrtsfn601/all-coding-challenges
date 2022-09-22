package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/

Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []
 
Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 
Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseLinkedList {
  
    // iteratively
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while (curr != null) {
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }
    
    // recursively
    public ListNode reverseList(ListNode head) {
        return reverseList(null, head);
    }
    
    public ListNode reverseList(ListNode prev, ListNode curr) {
        if (curr == null) {
            return prev;
        }
        ListNode next = curr.next;
        curr.next = prev;
        return reverseList(curr, next);
    }
}
