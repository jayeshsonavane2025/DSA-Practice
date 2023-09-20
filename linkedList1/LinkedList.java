package linkedList1;

public class LinkedList {
    public static void main(String[] args) {
        Node1<Integer> n0=new Node1<>(12);
        System.out.println(n0.value);
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