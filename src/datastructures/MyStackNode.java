package datastructures;

public class MyStackNode {

    private int value;
    private static int myStackNodeCounter;

    public MyStackNode(){myStackNodeCounter++;}

    public MyStackNode(int value){
        this.value = value;
        myStackNodeCounter++;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public static int getMyStackNodeCounter(){
        return myStackNodeCounter;
    }

    public static void reduceMyStackNodeCounter(){
        myStackNodeCounter--;
    }
}
