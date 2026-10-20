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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                ListNode dH = new ListNode(-1);
        ListNode newHead = dH;
        int carry = 0;
        
        while(l1!=null || l2!=null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            
            int sum = a + b + carry;
            carry = sum/10;
            
            ListNode newNode = new ListNode(sum%10);
            dH.next = newNode;
            dH = newNode;
        }
        
        if(carry!=0) {
            dH.next = new ListNode(carry);
        }
        return newHead.next;
    }
}


        
    