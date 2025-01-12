package inheritancexample;

public class WaterVehicle extends Vehicle{

    public void travelOnWater(){
        System.out.println("These vehicles travels on Water");
        System.out.println("Brand name is : "+super.brandName);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Water Vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Water Vehicle stopped");
    }

    @Override
    public void fueling() {
        System.out.println("Water vehcile fueled");
    }
}
