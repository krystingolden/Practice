package Nodes;

/* A binary tree node has data, pointer to
left child and a pointer to right child */
class Node {
    public int data;
    public Node left, right;
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
};
