package FactoryDesign;

public enum VehicleType {
    TRUCK {
        public Vehicle getVehicle() {
            return new Truck();
        }
    },
    CAR {
        public Vehicle getVehicle() {
            return new Car();
        }
    };

    abstract Vehicle getVehicle();
}
