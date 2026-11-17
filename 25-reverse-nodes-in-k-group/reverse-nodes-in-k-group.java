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
    public ListNode reverseKGroup(ListNode head, int k) {

               ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        for(int i=1;i<=size-k+1;i=i+k){
            head=reverseBetween(head,i,i+k-1);
        }
        return head;
            }
     public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;
        ListNode temp=head;
        ListNode bef=null;
        for(int i=1;i<left;i++){
            bef=temp;
            temp=temp.next;
        }
        ListNode cur=temp;
        ListNode prev=null;
        while(left<=right){
            ListNode newNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=newNode;
            left++;
        }
        temp.next = cur; 
        if (bef!=null) {
             bef.next=prev;
                      } 
         else 
         { 
            head=prev; 
         }
        return head;


 
    }
}