package datastructures;

public class MyDoubleLinkedListNode {
    private int value;
    private MyDoubleLinkedListNode next;
    private MyDoubleLinkedListNode prev;

    public MyDoubleLinkedListNode (int value){
        this.value = value;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    public boolean hasPrev(){
        return this.prev != null;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public MyDoubleLinkedListNode getNext(){
        return this.next;
    }

    public void setNext(MyDoubleLinkedListNode node){
        this.next = node;
    }

    public MyDoubleLinkedListNode getPrev(){
        return this.prev;
    }

    public void setPrev(MyDoubleLinkedListNode node){
        this.prev = node;
    }
}
