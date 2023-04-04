package dsa2_practice.LinkedList;

public class delete_kth_Node_from_strating {
    Node head;
    class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
    }

    void deleteNthNode(int n) {
        if (head == null) {
            return;
        } else if (n == 1) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 1; i < n-1; i++) {
                if (current.next == null) {
                    return;
                }
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


