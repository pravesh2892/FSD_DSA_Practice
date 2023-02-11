package contest_question_answer.Contest_05_02_23;

/*
// information about the class Node
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
static int getNthFromLast(Node head, int n)
        {
        int x =0;
        Node curr = head;
        while(curr !=null){
        curr = curr.next;
        x++;
        }
        if(x>=n){
        curr = head;
        for(int i=0; i<x-n; i++){
        curr = curr.next;
        }
        }
        return curr.data;
      

        }
