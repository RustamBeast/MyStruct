package datastructures;

public class MyRingListNode {
    private MyRingListNode next;
    private int value;

    public MyRingListNode (int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public MyRingListNode getNext(){
        return this.next;
    }

    public void setNext(MyRingListNode next){
        this.next = next;
    }

    public boolean hasNext(){
        return this.getNext() != null;
    }

}
