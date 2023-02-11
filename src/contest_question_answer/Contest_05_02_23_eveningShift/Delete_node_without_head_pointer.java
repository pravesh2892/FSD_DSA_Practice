package contest_question_answer.Contest_05_02_23_eveningShift;

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

public static void deleteNode(Node D) {
        D.val = D.next.val;
        D.next = D.next.next;
        }
