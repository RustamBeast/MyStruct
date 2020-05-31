package datastructures;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /* -------------------------------------
        LINKED LIST TESTING
        ----------------------------------------*/
        MyLinkedList list = new MyLinkedList();
        list.add(4);
        list.add(5);
        list.add(6);
        list.addAtStart(7);
        list.show();
        System.out.println();
        System.out.println(list.count());
        System.out.println();
        list.remove(7);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        System.out.println();
        System.out.println(list.isEmpty());
        System.out.println();
        list.add(28);
        list.show();
        System.out.println();
        System.out.println(list.isEmpty());
        System.out.println();
        MyLinkedList list2 = new MyLinkedList();
        list2.add(13);
        list2.add(16);
        list2.add(20);
        list2.add(27);
        list2.addAt(50, 2);
        list2.addAt(100, 1);
        list2.addAt(100, 0);
        list2.addAt(200,10);
        list2.show();
        System.out.println();
        /*------------------------------------------------------
        STACK TESTING
        ------------------------------------------------------*/
        ArrayList<MyStackNode> al = new ArrayList<MyStackNode>();
        MyStack s = new MyStack(al);
        s.push(1);
        s.push(2);
        s.push(5);
        s.push(7);
        s.show();
        System.out.println("The amount of the existing nodes is " + MyStackNode.getMyStackNodeCounter());
        System.out.println();
        s.pop();
        s.show();
        System.out.println("The amount of the existing nodes is " + MyStackNode.getMyStackNodeCounter());
        System.out.println();
        s.pop();
        s.show();
        System.out.println("The amount of the existing nodes is " + MyStackNode.getMyStackNodeCounter());
        System.out.println();
        s.pop();
        s.show();
        System.out.println("The amount of the existing nodes is " + MyStackNode.getMyStackNodeCounter());
        System.out.println();
        s.pop();
        s.show();
        System.out.println("The amount of the existing nodes is " + MyStackNode.getMyStackNodeCounter());
        System.out.println();
        s.pop();
        s.show();
        System.out.println("The amount of the existing nodes is " + MyStackNode.getMyStackNodeCounter());
        System.out.println();
        /*----------------------------------------------------------
        DOUBLE LINKED LIST TESTING
        ----------------------------------------------------------*/
        MyDoubleLinkedList l2 = new MyDoubleLinkedList();
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.show();
        System.out.println("There are " + l2.count() + " nodes in this list.");
        System.out.println("Is this list empty? " + l2.isEmpty());
        l2.addAtStart(10);
        l2.show();
        System.out.println();
        l2.remove(1);
        l2.show();
        System.out.println();
        l2.remove(0);
        l2.show();
        System.out.println();
        l2.remove(3);
        l2.show();
        System.out.println();
        /*--------------------------------------------------------
        RING LIST TESTING
        _______________________________________________________*/
        MyRingList list1 = new MyRingList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.show();
        System.out.println();
        System.out.println(list1.getHead().getValue());
        System.out.println();
        list1.add(4);
        list1.show();
        System.out.println();
        System.out.println(list1.count());
        System.out.println();
        list1.remove(2);
        list1.show();
        System.out.println();
        /*--------------------------------------------------------
        BINARY TREE TESTING
        _______________________________________________________*/
        MyBinaryTreeNode node = new MyBinaryTreeNode(16);
        node.add(6);
        node.add(17);
        System.out.println(node.getValue() + " " + node.getLeft().getValue() + " " + node.getRight().getValue());
        System.out.println(node.contains(6) + " " + node.contains(24));
        MyBinaryTree tree = new MyBinaryTree();
        tree.add(11);
        tree.add(12);
        tree.add(5);
        System.out.println(tree.contains(11) + " " + tree.getRoot().getRight().getValue());
        System.out.println(tree.size(tree.getRoot()));
        tree.add(18);
        tree.add(27);
        System.out.println(tree.size(tree.getRoot()));
        System.out.println();
    }
}
