package contest_question_answer.Contest_05_02_23;

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
public static Node ReverseAlternateK(Node head,int k){
        Node current = head;
        Node next = null;
        Node prev = null;
        int count=0;
        while(current !=null && count<k){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        count++;
        }
        if(head !=null){
        head.next = current;
        }
        count=0;
        while(count <k-1 && current !=null){
        current = current.next;
        count++;
        }
        if(current !=null){
        current.next= ReverseAlternateK(current.next, k);
        }
        return prev;
        }