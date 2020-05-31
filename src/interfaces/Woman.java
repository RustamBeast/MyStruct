package interfaces;

public class Woman implements Voice{
    private double height;

    public Woman(double height){
        this.height = height;
    }

    @Override
    public void voice() {
        System.out.println("High");
    }

    public double getHeight(){
        return this.height;
    }
}
