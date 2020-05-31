package datastructures;

public class MyRingList {
    private MyRingListNode head;

    public void add(int value){
        MyRingListNode node = new MyRingListNode(value);
        if (head == null){
            head = node;
            head.setNext(head);
        }
        else {
            MyRingListNode n = head;
            while (n.hasNext()){
                if (n.getNext() == head){
                    n.setNext(node);
                    node.setNext(head);
                    break;
                }
                else {
                    n = n.getNext();
                }
            }
        }
    }

    public void show(){
        MyRingListNode node = head;
        while (node.hasNext()){
            System.out.println(node.getValue());
            if (node.getNext() == head)
                break;
            node = node.getNext();
        }
    }

    public int count(){
        MyRingListNode node = head;
        int count = 0;
        while (node.hasNext()){
            if (node.getNext() == head){
                count++;
                break;
            }
            else {
                count++;
                node = node.getNext();
            }
        }
        return count;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    // Remove the node from the certain index
    public void remove(int index){
        if (!this.isEmpty()) {
            if (index < this.count() && index != 0) {
                MyRingListNode node = head;
                int count = 0;
                while (count != index - 1) {
                    node = node.getNext();
                    count++;
                }
                node.setNext(node.getNext().getNext());
            }
            if (index>=this.count())
                System.out.println("Index " + index + " is bigger than the length of the list. The list stays the same");
            if (index == 0) {
                MyRingListNode node = head;
                head = node.getNext();
            }
        } else {
            System.out.println("There is nothing to remove!");
        }
    }

    public MyRingListNode getHead(){
        return this.head;
    }
}
