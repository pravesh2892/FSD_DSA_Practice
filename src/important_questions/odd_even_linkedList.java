package important_questions;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp = head;
        ListNode oddhead= head;
        ListNode evenhead = head.next;
        ListNode connectNode = head.next;
        while(oddhead!=null && evenhead !=null){
            ListNode t = evenhead .next;
            if(t==null){
                break;
            }
            oddhead.next = evenhead .next;
            oddhead = oddhead.next;

            evenhead .next = oddhead.next;
            evenhead  = evenhead .next;
        }
        oddhead.next = connectNode;
        return temp;

    }
}
