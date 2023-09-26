package linkedList4;

public class MainClass {

    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        l1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        printLinkedList(l1);
        Node reOrder = reorderLL(l1);

        printLinkedList(reOrder);

//        Node l2 = new Node(9);
//        Node n4 = new Node(4);
//        l2.next = n4;
//
//        printLinkedList(l1);
//        printLinkedList(l2);
//
//        Node sum = addTwoLL(l1, l2);
//        printLinkedList(sum);

    }

    static Node reorderLL(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node l2 = reverseLinkedList(slow);
        Node l1 = head;

        while (true) {
            if(l1 == l2) {
                l1.next = null;
                break;
            }
            Node l1Next = l1.next;
            Node l2Next = l2.next;
            l1.next = l2;
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
        return head;
    }

    static Node addTwoLL(Node l1, Node l2) {
        Node r1 = reverseLinkedList(l1);
        Node r2 = reverseLinkedList(l2);

        int carry = 0;
        Node ans = null;
        Node temp = null;
        while(r1 != null || r2 != null || carry != 0) {
            int sum = carry;
            if(r1 != null) {
                sum += r1.data;
                r1 = r1.next;
            }
            if(r2 != null) {
                sum += r2.data;
                r2 = r2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;
            Node newNode = new Node(digit);
            if(ans == null) {
                ans = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        return reverseLinkedList(ans);
    }

    static Node reverseLinkedList(Node head) {
        if(head == null || head.next == null) return head;
        Node prev = head;
        Node cur = head.next;
        head.next = null;

        while(cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
    static void printLinkedList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }


}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

