package datastructures;

public class MyBinaryTreeNode {

    private int value;
    private MyBinaryTreeNode left;
    private MyBinaryTreeNode right;

    public MyBinaryTreeNode(int value){
        this.value = value;
    }

    public MyBinaryTreeNode(){}

    // Recursive way of inserting the values into the tree
    public void add(int value){
        if (value < this.value){
            if (this.left != null)
                left.add(value);
            else left = new MyBinaryTreeNode(value);
        }
        else if (value > this.value){
            if (this.right != null)
                right.add(value);
            else right = new MyBinaryTreeNode(value);
        }
    }

    // Check if the certain value is in the tree
    public boolean contains(int value){
        if (this.value == value)
            return true;
        if (value < this.value){
            if (this.left != null)
                return left.contains(value);
            return false;
        }
        else {
            if (this.right != null)
                return right.contains(value);
            return false;
        }
    }


    public int getValue() {
        return value;
    }

    public MyBinaryTreeNode getLeft() {
        return left;
    }

    public MyBinaryTreeNode getRight() {
        return right;
    }
}
