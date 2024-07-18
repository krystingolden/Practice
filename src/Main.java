import Nodes.BinarySortTreeCheck;
import Nodes.NodeSwap;
import StringDuplication.StringDuplicationHelper;

public class Main {
    public static void main(String[] args)
    {
        //Checks to see if a given binary tree is a BST
        BinarySortTreeCheck.checkIfTreeIsBst();

        //Swaps 2 nodes in a binary tree
        NodeSwap.swapNodesInBinaryTree();

        //Removes duplicate letters from a given string
        StringDuplicationHelper.identifyStringDuplicates();
    }
}