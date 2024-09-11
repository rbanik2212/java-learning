package Singleton;

public class OfficeBuilding {
    private static OfficeBuilding instance;
    private int count = 1;


    private OfficeBuilding() {
        this.count++;
    }

    public static OfficeBuilding getInstance() {
        if (instance == null) {
            instance = new OfficeBuilding();
        }
        return instance;
    }


    public int test() {
        return count;
    }


}
