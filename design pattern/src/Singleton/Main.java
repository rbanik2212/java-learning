package Singleton;

public class Main {
    public static void main(String[] args) {
        OfficeBuilding officeBuilding = OfficeBuilding.getInstance();
//        OfficeBuilding officeBuilding2 = new OfficeBuilding();
//        officeBuilding.test();

//        same object on that both variables are point at;
        System.out.println(officeBuilding);
    }
}
