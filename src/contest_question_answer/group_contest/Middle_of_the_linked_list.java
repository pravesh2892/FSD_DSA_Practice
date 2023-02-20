package contest_question_answer.group_contest;

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static void MiddleElement(Node head) {

        Node slow=head, fast=head, curr=null;
        while(fast !=null && fast.next!=null){
        curr =slow;
        fast= fast.next.next;
        slow= slow.next;
        }

        if(fast!=null){
        System.out.print(slow.val);
        }else{
        System.out.print(curr.val+" "+curr.next.val);
        }

        }
