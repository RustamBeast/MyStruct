package interfaces;

public class Man implements Voice{
    private int age;

    public Man(int age){
        this.age = age;
    }

    public void voice(){
        System.out.println("Deep");
    }

    public int getAge(){
        return this.age;
    }

}
