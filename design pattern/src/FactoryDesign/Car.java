package FactoryDesign;

public class Car implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("this is a car....");
    }
}
