package linkedListLIVE;

public class MainClass {

    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        l1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        int k = 2;
        printLinkedList(l1);
        Node reverseKGroups = reverseKGroups(l1, k);

        printLinkedList(reverseKGroups);
    }

    static void printLinkedList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node reverseKGroups(Node head, int k) {
        Node dummy = new Node(-1);
        dummy.next = head;

        Node prevTail = dummy;
        Node curHead = head;

        while (curHead != null) {
            Node curTail = findTailAfterK(curHead, k);
            if(curTail == null) break;
            Node nextHead = curTail.next;
            reverseKTimes(curHead, k);
            prevTail.next = curTail;
            prevTail = curHead;
            curHead = nextHead;
        }
        prevTail.next = curHead;
        return dummy.next;
    }

    static Node findTailAfterK(Node head, int k) {
        for(int i = 0; i<k-1; i++) {
            head = head.next;
            if(head == null) return null;
        }
        return head;
    }

    static Node reverseKTimes(Node head, int k) {
        if(head == null || head.next == null) return head;
        Node cur = head;
        Node prev = null;
        int count = 0;
        while(count < k && cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }
        return prev;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
