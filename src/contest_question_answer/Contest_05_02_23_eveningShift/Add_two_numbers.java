package contest_question_answer.Contest_05_02_23_eveningShift;
/*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/

static Node addNumber(Node first, Node second){
        Node dammyNode = new Node(0);
        Node  curr = dammyNode;
        int carry=0;
        while(first !=null || second !=null){
        int x = (first!=null) ? first.data: 0;
        int y = (second!=null) ? second.data: 0;
        int sum = x+y+ carry;
        carry = sum/10;

        curr.next = new Node(sum%10);
        curr = curr.next;
        if( first !=null) first = first.next;
        if( second !=null) second = second.next;

        }
        if(carry>0){
        curr.next = new Node(carry);
        }
        return dammyNode.next;
        }
