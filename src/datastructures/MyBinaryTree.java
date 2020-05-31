package datastructures;

public class MyBinaryTree {

    private MyBinaryTreeNode root;

    // Add value to the tree, using the recursive way of inserting, that's why i'm calling the node function.
    public void add(int value){
        if (this.root == null){
            this.root = new MyBinaryTreeNode(value);
        }
        root.add(value);
    }

    // Check if there is a certain value in the structure
    public boolean contains(int value){
        return root.contains(value);
    }

    // Return the size of the tree
    public int size(MyBinaryTreeNode node){
        if (node == null)
            return 0;
        return size(node.getLeft()) + 1 + size(node.getRight());
    }

    public MyBinaryTreeNode getRoot() {
        return root;
    }
}
