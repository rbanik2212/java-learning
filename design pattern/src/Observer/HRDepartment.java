package Observer;

public class HRDepartment implements IObserver {
    @Override
    public void callMe() {
        System.out.println("this is the HRDEPARTMENT");
    }
}
