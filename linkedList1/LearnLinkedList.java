package linkedList1;

public class LearnLinkedList {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);

        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(5);
        Node<Integer> n3 = new Node<>(8);

        head.next = n1;
        n1.prev = head;

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;



        printLinkedList(head);

        head = deleteFromLinkedList(3, head);

//        head = insertInLinkedList(5, 4, head);

        printLinkedList(head);

    }

    public static Node<Integer> deleteFromLinkedList(int pos, Node<Integer> head) {
        if(pos == 0) {
            return head.next;
        }
        Node<Integer> temp = head;
        for(int i = 0; i<pos-1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> insertInLinkedList(int pos, int data, Node<Integer> head) {

        Node<Integer> newNode = new Node<>(data);

        if(pos == 0) {
            newNode.next = head;
            head.prev = newNode;

            return newNode;
        }
        Node<Integer> temp = head;
        for(int i = 0; i<pos-1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }


}

class Node<E> {
    E val;
    Node<E> next;
    Node<E> prev;

    public Node(E val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
