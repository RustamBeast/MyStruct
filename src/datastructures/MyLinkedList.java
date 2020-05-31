package datastructures;

public class MyLinkedList {
    MyLinkedListNode head;

    // Add the node to the end of the list
    public void add(int value){
        MyLinkedListNode n = new MyLinkedListNode(value);
        if (head==null){
            head = n;
            head.next = null;
        }
        else {
            MyLinkedListNode node = head;
            while (node.hasNext()){
                node = node.next;
            }
            node.next = n;
        }
    }

    // Print all values of the list
    public void show() throws NullPointerException {
        MyLinkedListNode node = head;
        System.out.println("--This list exists of these values--");
        try {
            while (node.hasNext()) {
                System.out.println(node.getValue());
                node = node.next;
            }
            System.out.println(node.getValue());
        }
        catch (Exception e){
            System.out.println("List is empty");
        }
        System.out.println("------------------------------------");
    }

    // Count the amount of the nodes in the list
    public int count(){
        int count = 0;
        MyLinkedListNode node = head;
        while (node.hasNext()){
            node = node.next;
            count++;
        }
        return ++count;
    }

    // Remove the node from the certain index
    public void remove(int index){
        if (!this.isEmpty()) {
            if (index < this.count() && index != 0) {
                MyLinkedListNode node = head;
                int count = 0;
                while (count != index - 1) {
                    node = node.next;
                    count++;
                }
                node.next = node.next.next;
                System.out.println("Removing the node with the index " + index + ". The list looks like this now: ");
            }
            if (index>=this.count())
                System.out.println("Index " + index + " is bigger than the length of the list. The list stays the same");
            if (index == 0) {
                MyLinkedListNode node = head;
                head = node.next;
            }
        } else {
            System.out.println("There is nothing to remove!");
        }
        this.show();
    }

    // Check if the list is empty
    public boolean isEmpty(){
        return head==null;
    }

    // Creating the new head of the list
    public void addAtStart(int value){
        MyLinkedListNode node = new MyLinkedListNode(value);
        node.next = head;
        head = node;
    }

    // Add the node on the certain index
    public void addAt(int value, int index){
        if (index<this.count()-1 && index!=0){
            MyLinkedListNode node = new MyLinkedListNode(value);
            MyLinkedListNode n = head;
            int count = 0;
            while (count != index-1){
                n = n.next;
                count++;
            }
            MyLinkedListNode temp = n.next;
            n.next = node;
            node.next = temp;
        }

        if (index > this.count()-1)
            System.out.println("Index " + index + " is bigger than the length of the list." );
        if (index == 0)
            System.out.println("You've used 'addAt' method with the value " + value + " and the index 0. Use 'addAtStart' method!");
    }

}
