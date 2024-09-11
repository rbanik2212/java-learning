package FactoryDesign;

public class Truck implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("this is a truck");
    }
}
