/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 /** */
 class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        ListNode t = head;
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        int a[]=new int[c];
        t=head;
        for(int i =0;i<c;i++){
            a[i]=t.val;
            t=t.next;
        }
        Arrays.sort(a);
        t=head;
        for(int i = 0;i<c;i++){
            t.val=a[i];
            t=t.next;
        }
        return head;
    }
}