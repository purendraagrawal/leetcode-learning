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
    public ListNode middleNode(ListNode head) {
        ListNode[] temp = new ListNode[100];
        int i=0;
        while(head!=null){
            temp[i] = head;
            head = head.next;
            i++;
        }
        return temp[i/2];
    }
}