package contest_question_answer.Contest_05_02_23_eveningShift;

/*

 class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/
static Node deleteEven(Node head){
        Node  pointer = head;
        Node next;
        do{
        if(pointer.data %2==0)
        delteNode(head, pointer);

        next = pointer.next;
        pointer = next;

        }while(pointer!= head);

        return head;
        }
static Node delteNode(Node headref , Node del){
        Node temp = headref;
        if(headref==del)
        headref = del.next;

        while(temp.next != del){
        temp = temp.next;
        }
        temp.next = del.next;

        return headref;
        }
