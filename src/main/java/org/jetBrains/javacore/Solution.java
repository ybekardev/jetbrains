package org.jetBrains.javacore;

class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(5);
        tree.root.left = new Node(6);
        tree.root.right = new Node(4);
        tree.root.left.right = new Node(7);
        tree.root.left.right.left = new Node(3);
        tree.root.left.right.right = new Node(8);
        tree.root.right.right = new Node(2);
        tree.root.right.right.left = new Node(9);

        int value = Tree.findMax(tree.root);
        if (value > 0){
            System.out.println(Tree.findMax(tree.root));
        }
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;

    }
}

class Tree {
    Node root;
    static int findMax(Node node) {

        if (node == null)
            return Integer.MIN_VALUE;
        int response = node.data;
        int leftResponse = findMax(node.left);
        int rightResponse = findMax(node.right);
        if (leftResponse > response)
            response = leftResponse;

        if(rightResponse == response)
            response = rightResponse;
        return response;
    }

}




