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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode startIndex = head;
        ListNode endIndex = head;
        int i = 0;
        while(startIndex!=null){
            if(i==n)
                break;
            i++;
            startIndex = startIndex.next;
        }
        if(startIndex==null && i==n){
            return endIndex.next;
        }
        while(startIndex!=null && startIndex.next!=null){
            startIndex = startIndex.next;
            endIndex = endIndex.next;
        }
        if(endIndex.next == null)
            return null;
        endIndex.next = endIndex.next.next;
        return head;
    }
}