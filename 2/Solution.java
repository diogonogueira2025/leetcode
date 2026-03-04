class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(0);
        ListNode auxLn = ln;

        while(l1 != null || l2 != null){
            if(l1 != null){
                auxLn.val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                auxLn.val += l2.val;
                l2 = l2.next;
            }
            int resto = 0;
            if(auxLn.val >= 10){
                auxLn.val -= 10;
                resto = 1;
            }
            if(l1 != null || l2 != null || resto != 0){
                auxLn.next = new ListNode(resto);
                auxLn = auxLn.next;
            }
            
        }

        return ln;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}