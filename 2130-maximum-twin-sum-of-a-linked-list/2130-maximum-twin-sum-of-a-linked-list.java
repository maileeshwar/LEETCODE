/**
 * Definition for singly-linked list.
  * public class ListNode {
   *     int val;
    *     ListNode next;
     *     ListNode(int val) { this.val = val; }
      * }
       */
       
       class Solution {
           public int pairSum(ListNode head) {
                   
                           // Step 1: Find middle of the linked list
                                   ListNode slow = head;
                                           ListNode fast = head;
                                                   
                                                           while (fast != null && fast.next != null) {
                                                                       slow = slow.next;
                                                                                   fast = fast.next.next;
                                                                                           }
                                                                                                   
                                                                                                           // Step 2: Reverse second half
                                                                                                                   ListNode prev = null;
                                                                                                                           while (slow != null) {
                                                                                                                                       ListNode nextNode = slow.next;
                                                                                                                                                   slow.next = prev;
                                                                                                                                                               prev = slow;
                                                                                                                                                                           slow = nextNode;
                                                                                                                                                                                   }
                                                                                                                                                                                           
                                                                                                                                                                                                   // Step 3: Find maximum twin sum
                                                                                                                                                                                                           int maxSum = Integer.MIN_VALUE;
                                                                                                                                                                                                                   ListNode first = head;
                                                                                                                                                                                                                           ListNode second = prev;
                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                           while (second != null) {
                                                                                                                                                                                                                                                       maxSum = Math.max(maxSum, first.val + second.val);
                                                                                                                                                                                                                                                                   first = first.next;
                                                                                                                                                                                                                                                                               second = second.next;
                                                                                                                                                                                                                                                                                       }
                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                       return maxSum;
                                                                                                                                                                                                                                                                                                           }
       }
       