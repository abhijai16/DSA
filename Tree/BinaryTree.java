package Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTree {

    public BinaryTree(){

    }
    
    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    public void insert(Scanner sc){
        System.out.println("Enter the root node: ");
        int val = sc.nextInt();
        
        root = new Node(val);
        insert(sc, root);
    }
    
    private void insert(Scanner sc, Node node){
        System.out.println("Do you want to enter left of " + node.val);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of " + node.val);
            int val = sc.nextInt();
            node.left = new Node(val);
            insert(sc, node.left);
        }

        System.out.println("Do you want to enter right of " + node.val);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " + node.val);
            int val = sc.nextInt();
            node.right = new Node(val);
            insert(sc, node.right);
        }
    }

    public void display(){
        display(this.root, "");
    }
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void preOrder(){
        System.out.print("Preorder: ");
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        System.out.print("Inorder: ");
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }

    public void postOrder(){
        System.out.print("Postorder: ");
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }

    public void levelOrder(){
        System.out.println("Levelorder: ");
        levelOrder(root);
    }
    public void levelOrder(Node node){
        Queue<Node> queue = new LinkedList<>();

        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                Node current = queue.poll();

                System.out.print(current.val+" ");

                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
            System.out.println();
        }
    }

}
