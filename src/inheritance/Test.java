package inheritance;

public class Test {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(4, 210.0);
        Vehicle sportCar = new SportCar(2, 387.4);
        getMaxSpeed(car);
        getMaxSpeed(sportCar);
    }

    public static void getMaxSpeed(Vehicle vehicle){
        System.out.println(vehicle.maxSpeed);
    }

}
