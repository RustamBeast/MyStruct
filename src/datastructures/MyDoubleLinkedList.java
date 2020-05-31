package datastructures;

public class MyDoubleLinkedList {
    private MyDoubleLinkedListNode head;

    // Inserting the node in the list.
    public void add(int value){
        MyDoubleLinkedListNode node = new MyDoubleLinkedListNode(value);
        if (head == null){
            head = node;
            head.setNext(null);
            head.setPrev(null);
        }
        else{
            MyDoubleLinkedListNode n = head;
            while (n.hasNext()){
                n = n.getNext();
            }
            n.setNext(node);
            node.setPrev(n);
        }
    }

    // Show the whole list.
    public void show(){
        MyDoubleLinkedListNode node = head;
        while (node.hasNext()) {
            if (node.getPrev()!=null)
                System.out.println("The value of this node is " + node.getValue() + ". The previous value is " + node.getPrev().getValue() + ", the next value is " + node.getNext().getValue() + ".");
            if (node.getPrev()==null)
                System.out.println("The value of the head node is " + node.getValue() + ", the next value is " + node.getNext().getValue() + ".");
            node = node.getNext();
        }
        System.out.println("The value of the last node is " + node.getValue() + ". The previous value is " + node.getPrev().getValue() +  ".");
    }

    // Count the amount of the nodes in the list.
    public int count(){
        int count = 0;
        MyDoubleLinkedListNode node = head;
        while (node.hasNext()){
            node = node.getNext();
            count++;
        }
        return ++count;
    }

    // Check if the list is empty
    public boolean isEmpty(){
        return head == null;
    }

    // Creating the new head of the list
    public void addAtStart(int value){
        MyDoubleLinkedListNode node = new MyDoubleLinkedListNode(value);
        node.setNext(head);
        head.setPrev(node);
        head = node;
    }

    // Removing the node from the certain index in the list
    public void remove(int index){
        if (!this.isEmpty()){
            int count = 0;
            if (index < this.count() && index != 0){
                MyDoubleLinkedListNode node = head;
                while (count != index - 1){
                    node = node.getNext();
                    count++;
                }
                node.getNext().getNext().setPrev(node);
                node.setNext(node.getNext().getNext());
            }
            if (index >= this.count())
                System.out.println("The index " + index + " is bigger than the amount of the existing values");
            if (index == 0){
                MyDoubleLinkedListNode node = head;
                node.getNext().setPrev(null);
                head = node.getNext();
            }
        }
    }
}
