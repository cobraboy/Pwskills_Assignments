package M66_LinkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q1 {
    public static boolean search(Node head, int x) {
        while (head != null) {
            if (head.data == x) return true;
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(11);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);
        System.out.println(search(head, 14) ? "Yes" : "No");
    }
}
