package inheritancexample;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("------------------------Vehicle parent class-------------------");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.fueling();

        System.out.println("---------------------Air Vehicle Child class---------------------");
        AirVehicle airVehicle =new AirVehicle();
        airVehicle.travelOnAir();
        airVehicle.start();
        airVehicle.stop();
        airVehicle.fueling();

        System.out.println("---------------------Water Vehicle Child class---------------------");
        WaterVehicle waterVehicle =new WaterVehicle();
        waterVehicle.travelOnWater();
        waterVehicle.start();
        waterVehicle.stop();
        waterVehicle.fueling();

        System.out.println("---------------------Road Vehicle Child class---------------------");
        RoadVehicle roadVehicle =new RoadVehicle();
        roadVehicle.travelOnRoad();
        roadVehicle.start();
        roadVehicle.stop();
        roadVehicle.fueling();
    }
}
