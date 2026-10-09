package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BinaryTree bt = new BinaryTree();
        // bt.insert(sc);
        // bt.display();

        BST tree = new BST();
        tree.populate(sc);
        tree.display();
    }
}
