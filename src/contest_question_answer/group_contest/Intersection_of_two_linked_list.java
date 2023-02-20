package contest_question_answer.group_contest;

public static Node intersection(Node head1,Node head2){
        Node curr1= head1;
        Node curr2 = head2;
        Node temp= null;
        while(curr1 !=null){
        curr2 = head2;
        while(curr2 !=null){
        if(curr1== curr2){
        return curr1;
        }
        curr2 = curr2.next;
        }
        curr1 = curr1.next;
        }
        return temp;
        }