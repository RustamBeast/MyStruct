package datastructures;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<MyStackNode> stack = new ArrayList<MyStackNode>();

    // Custom constructor
    public MyStack(List<MyStackNode> stack){
        this.stack = stack;
    }

    //Adding a new value (actually we are inserting a new node) to this stack
    public void push(int value){
        MyStackNode node = new MyStackNode(value);
        for(int i = 0; i<this.stack.size();i++){}
        this.stack.add(node);
    }

    //Removing the last element of the stack
    public void pop(){
        int i = 0;
        if (this.stack.isEmpty())
            System.out.println("This stack is empty!");
        else {
            for (; i < this.stack.size(); i++) {}
            this.stack.remove(i - 1);
            MyStackNode.reduceMyStackNodeCounter();
        }
    }

    public void peek(){
        for (MyStackNode element : this.stack){}
    }

    //Showing all values from the stack
    public void show(){
        for (int i = 0; i < this.stack.size(); i++){
            System.out.println(this.stack.get(i).getValue());
        }
    }


}
