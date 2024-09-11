package Observer;

public class Main {
    public static void main(String[] args) {
        IObserver payRoll = new PayRollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(hrSystem);
        ems.registerObserver(payRoll);

        Employee raj = new Employee(1, "raj");

        ems.setEmployee(raj);

        ems.modifyEmployeeName("ishan");

    }
}
