package Nodes;

import java.util.ArrayList;
import java.util.Collections;

public class NodeSwap {
    public static void swapNodesInBinaryTree(){
         /*   6
            / \
           10  2
          / \ / \
         1  3 7 12

        10 and 2 are swapped */

        Node root = new Node(6);
        root.left = new Node(10);
        root.right = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(12);
        root.right.left = new Node(7);

        // Inorder traversal of the Original Tree
        System.out.println(
                "\nOriginal tree");
        printBinaryTree(root);

        correctBST(root);

        // inorder traversal of the fixed tree
        System.out.println(
                "\nFixed tree");
        printBinaryTree(root);
    }

    public static void storeInVector(Node root,
                                     ArrayList<Integer> vec)
    {
        if (root == null)
            return;
        storeInVector(root.left, vec);
        vec.add(root.data);
        storeInVector(root.right, vec);
    }

    public static void correctBSTUtil(Node root, ArrayList<Integer> vec,
                   int[] index)
    {
        if (root == null)
            return;
        correctBSTUtil(root.left, vec, index);
        root.data = vec.get(index[0]);
        index[0]++;
        correctBSTUtil(root.right, vec, index);
    }

    public static void correctBST(Node root)
    {
        // ArrayList to store the inorder traversal of
        // given tree
        ArrayList<Integer> vec = new ArrayList<Integer>();
        storeInVector(root, vec);
        Collections.sort(vec);
        int[] index = { 0 };
        correctBSTUtil(root, vec, index);
    }

    public static void printBinaryTree(Node root)
    {
        //print node values throughout tree from left to right
        if (root == null)
            return;
        printBinaryTree(root.left);
        System.out.print(root.data + " ");
        printBinaryTree(root.right);
    }
}
