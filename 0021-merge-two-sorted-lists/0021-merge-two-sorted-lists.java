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
        ListNode mergeTwoLists = null;
        ListNode tail = null;
        
        while(list1 != null || list2 != null){
            int data;
            if(list1 == null){
                data = list2.val;
                list2 = list2.next;
            }else if(list2 == null){
                data = list1.val;
                list1 = list1.next;
            }else{
                if(list1.val < list2.val){
                    data = list1.val;
                    list1 = list1.next;
                }else{
                    data = list2.val;
                    list2 = list2.next;
                }
            }
            ListNode newNode = new ListNode(data);
            if(mergeTwoLists == null){
                mergeTwoLists = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        return mergeTwoLists;
    }
}