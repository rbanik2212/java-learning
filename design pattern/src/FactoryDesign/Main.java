package FactoryDesign;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vf = new VehicleFactory();

        Vehicle veh = vf.getVehicle("CAR");
        veh.startEngine();
    }
}
