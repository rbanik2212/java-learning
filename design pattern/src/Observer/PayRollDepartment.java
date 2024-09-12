package Observer;

public class PayRollDepartment implements IObserver{
    @Override
    public void callMe() {
        System.out.println("this is the PAYROLLDEPARTMENT");
    }
}
