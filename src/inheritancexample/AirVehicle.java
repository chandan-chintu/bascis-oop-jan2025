package inheritancexample;

public class AirVehicle extends Vehicle{

    public void travelOnAir(){
        System.out.println("These vehicles travels on Air");
    }

    //added dummy codes
    //added dummy codes
    @Override
    public void start() {
        System.out.println("Air Vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Air Vehicle stopped");
    }

    @Override
    public void fueling() {
        System.out.println("Air vehcile fueled");
    }
}
