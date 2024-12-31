package M66_LinkedList;

public class Q5 {
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node l1 = new Node(5);
        l1.next = new Node(6);
        l1.next.next = new Node(3);
        Node l2 = new Node(8);
        l2.next = new Node(4);
        l2.next.next = new Node(2);
        Node result = addTwoNumbers(l1, l2);
        printList(result);
    }
}
