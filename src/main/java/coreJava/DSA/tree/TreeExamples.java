package coreJava.DSA.tree;

public class TreeExamples {
    Node root;
    public TreeExamples() {
        root = null;
    }
    public static void main(String[] args) {
        TreeExamples tree = new TreeExamples();

        // creating nodes manually
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        System.out.println("Tree created successfully");
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}