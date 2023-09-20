package linkedList1;

public class LinkedList {
    public static void main(String[] args) {
        Node1<Integer> head=new Node1<>(12);
        Node1<Integer> n1=new Node1<>(13);
        Node1<Integer>n2=new Node1<>(14);
        Node1<Integer>n3=new Node1<>(15);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        printLinkedList(head);


    }

    private static void printLinkedList(Node1<Integer> head) {
        Node1<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
    }
}

class Node1<E>{
    int value;
    Node1<E> next;

    public Node1(int value) {
        this.value = value;
        this.next = next;
    }
}