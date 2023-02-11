package contest_question_answer.Contest_05_02_23;

/*

class Node {
    Node next;
    Node random;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        random = null;
    }
}
*/

public static Node CloneList(Node head) {
        Node iter = head;
        while(iter !=null){
        Node clone = new Node(iter.val);
        Node nextElement = iter.next;
        iter.next = clone;
        clone.next = nextElement;

        iter = nextElement;
        }
        iter = head;
        while(iter !=null){
        if(iter.random !=null){
        Node clone = iter.next;
        clone.random = iter.random.next;
        }
        iter = iter.next.next;
        }
        Node orginal = head;
        Node clone = orginal.next;
        Node cloneAns = orginal.next;

        while(clone.next !=null){
        Node nextorginal = orginal.next.next;
        Node nextclone = clone.next.next;

        orginal.next = nextorginal;
        clone.next = nextclone;

        orginal = nextorginal;
        clone = nextclone;

        }
        orginal.next = orginal.next.next;

        return cloneAns;
        }
