class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        
        if(list1 == null && list2 != null){
            return new ListNode(list2.val, mergeTwoLists(null, list2.next));
        }

        if(list1 != null && list2 == null){
            return new ListNode(list1.val, mergeTwoLists(list1.next, null));
        }
        int v1 = list1.val;
        int v2 = list2.val;
        int res = Math.min(v1, v2);
        
        if(v1 == res){
            return new ListNode(res, mergeTwoLists(list1.next, list2));
        } else {
            return new ListNode(res, mergeTwoLists(list1, list2.next));
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}