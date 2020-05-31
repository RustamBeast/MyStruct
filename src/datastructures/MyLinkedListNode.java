package datastructures;

public class MyLinkedListNode {
    int value;
    MyLinkedListNode next;
    public MyLinkedListNode(int value){
        this.value = value;
    }

    public boolean hasNext(){
        if (this.next!=null)
            return true;
        else return false;
    }

    public int getValue(){
        return this.value;
    }

}
