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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(-1, null);
        ListNode it = res;
        ListNode curr1 = list1;
        ListNode curr2 = list2;

        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                it.next = curr1;
                curr1 = curr1.next;
            }else{
                it.next = curr2;
                curr2 = curr2.next;
            }
            it = it.next;
        }
        if(curr1 != null){
            it.next = curr1;
        }else{
            it.next = curr2;
        }
        return res.next;
    }
}