package LinkedList;


public class CDLL {

    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");

        A.next = B;  B.prev = A;
        B.next = C;  C.prev = B;
        C.next = D;  D.prev = C;
        D.next = A;  A.prev = D;

        displayForward(A);
        System.out.println();
        displayBackward(D);
    }

    public static void displayForward(Node head) {
        Node current = head;
        if (head == null) return;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println( head.data );
    }

    public static void displayBackward(Node tail) {
        Node current = tail;
        if (tail == null) return;
        do {
            System.out.print(current.data + " -> ");
            current = current.prev;
        } while (current != tail);
        System.out.println( tail.data );
    }
}
class Node {
    String data;
    Node next, prev;

    Node(String data) {
        this.data = data;
    }
}

