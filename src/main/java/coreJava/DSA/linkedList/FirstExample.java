package coreJava.DSA.linkedList;

public class FirstExample {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        // linking nodes
        n1.next = n2;
        n2.next = n3;

        // Print list
        Node temp = n1;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}