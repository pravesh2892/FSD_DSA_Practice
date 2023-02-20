package contest_question_answer.group_contest;

/*
class Node
{
    int data;
    Node next,Child;

    Node(int item)
    {
        data = item;
        next = Child = null;
    }
}

*/
static void flattenList(Node head)
        {
        Node temp= null;
        Node curr = head;
        Node tail = head;
        while(tail.next!=null){
        tail = tail.next;
        }
        while(curr!=tail){
        if(curr.Child!=null){
        tail.next = curr.Child;
        temp = curr.Child;
        while(temp.next!=null){
        temp = temp.next;
        }
        tail = temp;
        }
        curr = curr.next;
        }

        }

