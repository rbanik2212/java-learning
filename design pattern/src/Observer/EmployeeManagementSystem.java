package Observer;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private Employee employee;
    private List<IObserver> observerList;

    public EmployeeManagementSystem() {
        this.observerList = new ArrayList<>() ;
    }

    public void registerObserver(IObserver obs){
        observerList.add(obs);
    }

    public void modifyEmployeeName(String newName){
        this.employee.setName(newName);
        notifyAllDepartments();

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void notifyAllDepartments() {
        for (IObserver obs : observerList) {
            obs.callMe();
        }
    }
}
