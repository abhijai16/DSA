package Tree;
import java.util.Scanner;

public class BST {
    BST(){

    }
    
    public class Node{
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    public boolean isEmpty(){
        return root==null;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int val){
        root = insert(val, root);
    }
    private Node insert(int val, Node node){
        if(node==null){
            node = new Node(val);
            return node;
        }
        if(val<node.val){
            node.left = insert(val, node.left);
        }
        if(val>node.val){
            node.right = insert(val, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
    }

    public void populate(Scanner sc){
        System.out.println("Enter total number of elements: ");
        int n = sc.nextInt();
        populate(sc, n);
    }
    private void populate(Scanner sc, int n){
        System.out.printf("Enter %d number:", n);
        for(int i=0; i<n; i++){
            this.insert(sc.nextInt());
        }
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && isBalanced(node.left) && isBalanced(node.right);
    }


}
